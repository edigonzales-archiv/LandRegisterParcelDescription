package ch.so.agi.landregisterparceldescription.webservice.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ch.so.agi.landregisterparceldescription.webservice.models.LandCoverShare;

@Transactional
@Repository
public class LandCoverShareDAOImpl implements LandCoverShareDAO {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<LandCoverShare> getLandCoverShareByEgrid(String egrid) {
        String sql = "WITH grundstueck AS\n" + 
                "(\n" + 
                "  SELECT\n" + 
                "    *\n" + 
                "  FROM\n" + 
                "    agi_mopublic_pub.mopublic_grundstueck\n" + 
                "  WHERE\n" + 
                "    egrid = :egrid\n" + 
                "),\n" + 
                "boflaeche AS (\n" + 
                "  SELECT\n" + 
                "    ST_CollectionExtract(ST_Intersection(bodenbedeckung.geometrie, grundstueck.geometrie), 3) AS geom,\n" + 
                "    bodenbedeckung.art, \n" + 
                "    bodenbedeckung.art_txt, \n" + 
                "    bodenbedeckung.bfs_nr,\n" + 
                "    grundstueck.nummer AS gs_nummer,\n" + 
                "    grundstueck.nbident AS gs_nbident, \n" + 
                "    grundstueck.egrid AS gs_egrid, \n" + 
                "    grundstueck.flaechenmass AS gs_flaechenmass,\n" + 
                "    grundstueck.art AS gs_art, \n" + 
                "    grundstueck.art_txt AS gs_art_txt\n" + 
                "  FROM\n" + 
                "    agi_mopublic_pub.mopublic_bodenbedeckung AS bodenbedeckung,\n" + 
                "    grundstueck\n" + 
                "  WHERE\n" + 
                "    ST_Intersects(bodenbedeckung.geometrie, grundstueck.geometrie)\n" + 
                ")\n" + 
                "SELECT\n" + 
                "  ST_Area(ST_Union(geom)) AS flaeche, \n" + 
                "  art, \n" + 
                "  art_txt\n" + 
                "FROM\n" + 
                "(\n" + 
                "  SELECT\n" + 
                "    (ST_Dump(geom)).geom, \n" + 
                "    boflaeche.art, \n" + 
                "    boflaeche.art_txt \n" + 
                "  FROM\n" + 
                "    boflaeche\n" + 
                "  WHERE\n" + 
                "    ST_IsEmpty(geom) = FALSE\n" + 
                ") AS foo\n" + 
                "GROUP BY\n" + 
                "  art, \n" + 
                "  art_txt \n" + 
                "ORDER BY\n" + 
                "  art_txt\n" + 
                ";";
        
        RowMapper<LandCoverShare> rowMapper = new BeanPropertyRowMapper<LandCoverShare>(LandCoverShare.class);
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("egrid", egrid);
        List<LandCoverShare> landCoverShareList = jdbcTemplate.query(sql, namedParameters, rowMapper);
    
        return landCoverShareList;
    }
}
