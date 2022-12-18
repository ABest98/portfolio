package com.techelevator.dao;

import com.techelevator.model.Me;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class JdbcMeDao implements MeDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcMeDao(DataSource datasource) {
        this.jdbcTemplate = new JdbcTemplate(datasource);
    }

    @Override
    public Me GetMe() {
        Me me = new Me();

        String sql = "SELECT my_id, my_name, my_age FROM me";

        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);

        if(rowSet.next()) {
            me = mapRowToMe(rowSet);
        }

        return me;
    }

    private Me mapRowToMe(SqlRowSet rowSet) {
        Me me = new Me();

        me.setMyId(rowSet.getInt("my_id"));
        me.setMyName(rowSet.getString("my_name"));
        me.setMyAge(rowSet.getInt("my_age"));

        return me;
    }
}
