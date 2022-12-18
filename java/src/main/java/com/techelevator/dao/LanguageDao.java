package com.techelevator.dao;

import com.techelevator.model.Language;

import java.util.List;

public interface LanguageDao {

    List<Language> getAllLanguages();
    Language getSpecificLanguage(int id);
}
