package com.techelevator.model;

import java.util.Objects;

public class Project {

    private int projectId;
    private String projectName;
    private String projectDesc;

    public Project() {

    }

    public Project(int projectId, String projectName, String projectDesc) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDesc = projectDesc;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return projectId == project.projectId && Objects.equals(projectName, project.projectName) && Objects.equals(projectDesc, project.projectDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, projectName, projectDesc);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectDesc='" + projectDesc + '\'' +
                '}';
    }
}
