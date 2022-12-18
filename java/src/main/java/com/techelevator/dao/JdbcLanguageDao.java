package com.techelevator.dao;

import com.techelevator.model.Language;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcLanguageDao implements LanguageDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcLanguageDao(DataSource datasource) {
        this.jdbcTemplate = new JdbcTemplate(datasource);
    }

    @Override
    public List<Language> getAllLanguages() {
        List<Language> allLanguages = new ArrayList<>();

        String sql = "SELECT lang_id, lang_name, proficiency FROM languages";

        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);

        while(rowSet.next()) {
            allLanguages.add(mapRowToLanguage(rowSet));
        }

        return allLanguages;
    }

    private Language mapRowToLanguage(SqlRowSet rowSet) {
        Language language = new Language();

        language.setLangId(rowSet.getInt("lang_id"));
        language.setLangName(rowSet.getString("lang_name"));
        language.setLangProf(rowSet.getInt("proficiency"));

        return language;
    }
}
