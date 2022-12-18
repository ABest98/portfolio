package com.techelevator.dao;

import com.techelevator.model.Project;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcProjectDao implements ProjectDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcProjectDao(DataSource datasource) {
        this.jdbcTemplate = new JdbcTemplate(datasource);
    }

    @Override
    public List<Project> getAllProjects() {
        List<Project> allProjects = new ArrayList<>();

        String sql = "SELECT project_id, project_name, project_description FROM project";

        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);

        while(rowSet.next()) {
            allProjects.add(mapRowToProject(rowSet));
        }

        return allProjects;
    }

    @Override
    public Project getSpecificProject(int id) {
        Project project = new Project();

        String sql = "SELECT project_id, project_name, project_description FROM project " +
                     "WHERE project_id = ?";

        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, id);

        if(rowSet.next()) {
            project = mapRowToProject(rowSet);
        }

        return project;
    }

    private Project mapRowToProject(SqlRowSet rowSet) {
        Project project = new Project();

        project.setProjectId(rowSet.getInt("project_id"));
        project.setProjectName(rowSet.getString("project_name"));
        project.setProjectDesc(rowSet.getString("project_description"));

        return project;
    }
}
