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

import ch.so.agi.landregisterparceldescription.webservice.models.BuildingAddress;

@Transactional
@Repository
public class BuildingAddressDAOImpl implements BuildingAddressDAO {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<BuildingAddress> getBuildingAddressByEgrid(String egrid) {
        String sql = "WITH grundstueck AS \n" + 
                "(\n" + 
                "  SELECT\n" + 
                "    *\n" + 
                "  FROM\n" + 
                "    agi_mopublic_pub.mopublic_grundstueck\n" + 
                "  WHERE\n" + 
                "    egrid = :egrid\n" + 
                "),\n" + 
                "gebaeudeadresse AS \n" + 
                "(\n" + 
                "  SELECT\n" + 
                "    adresse.strassenname,\n" + 
                "    adresse.hausnummer,\n" + 
                "    adresse.egid,\n" + 
                "    adresse.edid,\n" + 
                "    adresse.plz,\n" + 
                "    adresse.ortschaft\n" + 
                "  FROM\n" + 
                "    agi_mopublic_pub.mopublic_gebaeudeadresse AS adresse\n" + 
                "    RIGHT JOIN grundstueck\n" + 
                "    ON ST_Intersects(adresse.lage, grundstueck.geometrie)\n" + 
                ")\n" + 
                "SELECT\n" + 
                "  gebaeudeadresse.strassenname AS streetname,\n" + 
                "  gebaeudeadresse.hausnummer AS number,\n" + 
                "  gebaeudeadresse.egid AS egid,\n" + 
                "  gebaeudeadresse.edid AS edid,\n" + 
                "  gebaeudeadresse.plz AS postalcode,\n" + 
                "  gebaeudeadresse.ortschaft AS city\n" + 
                "FROM\n" + 
                "  gebaeudeadresse\n" + 
                ";";
        
        RowMapper<BuildingAddress> rowMapper = new BeanPropertyRowMapper<BuildingAddress>(BuildingAddress.class);
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("egrid", egrid);
        List<BuildingAddress> listBuildingAddress = jdbcTemplate.query(sql, namedParameters, rowMapper);
        return listBuildingAddress;
    }

}
