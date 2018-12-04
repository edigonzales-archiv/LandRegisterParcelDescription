package ch.so.agi.landregisterparceldescription.webservice.dao;

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

import ch.so.agi.landregisterparceldescription.webservice.models.Parcel;

@Transactional
@Repository
public class ParcelDAOImpl implements ParcelDAO {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public Parcel getParcelByEgrid(String egrid) {
        String sql = "WITH nomenklatur AS \n" + 
                "(\n" + 
                "  SELECT \n" + 
                "    string_agg(flurname.flurname, ', ' ORDER BY flurname.flurname) AS flurnamen\n" + 
                "  FROM\n" + 
                "    agi_mopublic_pub.mopublic_grundstueck AS grundstueck \n" + 
                "    LEFT JOIN agi_mopublic_pub.mopublic_flurname AS flurname\n" + 
                "    ON (ST_Intersects(grundstueck.geometrie, flurname.geometrie) AND NOT ST_Touches(grundstueck.geometrie, flurname.geometrie))\n" + 
                "  WHERE\n" + 
                "    grundstueck.egrid = :egrid\n" + 
                ")\n" + 
                "SELECT\n" + 
                "  grundstueck.t_id,\n" + 
                "  grundstueck.art,\n" + 
                "  split_part(grundstueck.art_txt,'.', array_upper(string_to_array(grundstueck.art_txt, '.'), 1)) AS art_txt,\n" + 
                "  grundstueck.nbident,\n" + 
                "  grundstueck.nummer,\n" + 
                "  grundstueck.egrid,\n" + 
                "  grundstueck.flaechenmass,\n" + 
                "  grundstueck.bfs_nr,\n" + 
                "  ST_XMin(grundstueck.geometrie) AS xmin,\n" + 
                "  ST_XMax(grundstueck.geometrie) AS xmax,\n" + 
                "  ST_YMin(grundstueck.geometrie) AS ymin,\n" + 
                "  ST_YMax(grundstueck.geometrie) AS ymax,\n" + 
                "  ST_AsBinary(grundstueck.geometrie) AS geometry,\n" +
                "  gb_kreis.aname AS grundbuchname,\n" + 
                "  gb_kreis.amtschreiberei,\n" + 
                "  gb_kreis.amt,\n" + 
                "  gb_kreis.strasse,\n" + 
                "  gb_kreis.hausnummer,\n" + 
                "  gb_kreis.plz,\n" + 
                "  gb_kreis.ortschaft,\n" + 
                "  gb_kreis.telefon,\n" + 
                "  gb_kreis.web,\n" + 
                "  gb_kreis.email,\n" + 
                "  nf_gemeinde.gemeindename,\n" + 
                "  nf_gemeinde.nfg_name,\n" + 
                "  nf_gemeinde.nfg_vorname,\n" + 
                "  nf_gemeinde.nfg_titel,\n" + 
                "  nf_gemeinde.firma,\n" + 
                "  nf_gemeinde.firma_zusatz,\n" + 
                "  nf_gemeinde.strasse AS nf_strasse,\n" + 
                "  nf_gemeinde.hausnummer AS nf_hausnummer,\n" + 
                "  nf_gemeinde.plz AS nf_plz,\n" + 
                "  nf_gemeinde.ortschaft AS nf_ortschaft,\n" + 
                "  nf_gemeinde.telefon AS nf_telefon,\n" + 
                "  nf_gemeinde.web AS nf_web,\n" + 
                "  nf_gemeinde.email AS nf_email,\n" + 
                "  nomenklatur.flurnamen\n" + 
                "FROM\n" + 
                "  agi_mopublic_pub.mopublic_grundstueck AS grundstueck\n" + 
                "  LEFT JOIN agi_av_gb_admin_einteilung_pub.grundbuchkreise_grundbuchkreis AS gb_kreis\n" + 
                "  ON ST_Intersects(ST_PointOnSurface(grundstueck.geometrie), gb_kreis.perimeter)\n" + 
                "  LEFT JOIN agi_av_gb_admin_einteilung_pub.nachfuehrngskrise_gemeinde AS nf_gemeinde\n" + 
                "  ON grundstueck.bfs_nr = nf_gemeinde.bfsnr\n" + 
                "  LEFT JOIN nomenklatur\n" + 
                "  ON 1=1\n" + 
                "WHERE\n" + 
                "  grundstueck.egrid = 'CH310663327779'\n" + 
                "LIMIT 1\n" + 
                ";";
        
        RowMapper<Parcel> rowMapper = new BeanPropertyRowMapper<Parcel>(Parcel.class);
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("egrid", egrid);
        Parcel parcel = jdbcTemplate.queryForObject(sql, namedParameters, rowMapper);
        return parcel;        
    }
}
