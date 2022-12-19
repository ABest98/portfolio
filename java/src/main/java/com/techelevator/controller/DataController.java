package com.techelevator.controller;

import com.techelevator.dao.LanguageDao;
import com.techelevator.dao.MeDao;
import com.techelevator.dao.ProjectDao;
import com.techelevator.model.Language;
import com.techelevator.model.Me;
import com.techelevator.model.Project;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin
@RestController
public class DataController {

    private LanguageDao languageDao;
    private MeDao meDao;
    private ProjectDao projectDao;

    public DataController(LanguageDao languageDao, MeDao meDao, ProjectDao projectDao) {
        this.languageDao = languageDao;
        this.meDao = meDao;
        this.projectDao = projectDao;
    }

    @RequestMapping(path = "/alex", method = RequestMethod.GET)
    public Me getAlex() {
        return meDao.GetMe();
    }

    @RequestMapping(path = "/alex/project", method = RequestMethod.GET)
    public List<Project> getProjects() {
        return projectDao.getAllProjects();
    }

    @RequestMapping(path = "/alex/project/{id}", method = RequestMethod.GET)
    public Project getSpecificProject(@PathVariable int id) {
        Project project = projectDao.getSpecificProject(id);
        if(project == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Project not found");
        } else {
            return project;
        }
    }

    @RequestMapping(path = "/alex/languages", method = RequestMethod.GET)
    public List<Language> getLanguages() {
        return languageDao.getAllLanguages();
    }

    @RequestMapping(path = "/alex/languages/{id}", method = RequestMethod.GET)
    public Language getSpecificLanguage(@PathVariable int id) {
        Language language = languageDao.getSpecificLanguage(id);
        if(language == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Language not found");
        } else {
            return language;
        }
    }

}
