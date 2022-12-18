package com.techelevator.dao;

import com.techelevator.model.Project;

import java.util.List;

public interface ProjectDao {

    List<Project> getAllProjects();
    Project getSpecificProject(int id);
}
