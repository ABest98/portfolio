package com.techelevator.model;

import java.util.Objects;

public class Language {

    private int langId;
    private String langName;
    private int langProf;

    public Language() {
        
    }

    public Language(int langId, String langName, int langProf) {
        this.langId = langId;
        this.langName = langName;
        this.langProf = langProf;
    }

    public int getLangId() {
        return langId;
    }

    public void setLangId(int langId) {
        this.langId = langId;
    }

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public int getLangProf() {
        return langProf;
    }

    public void setLangProf(int langProf) {
        this.langProf = langProf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language language = (Language) o;
        return langId == language.langId && langProf == language.langProf && Objects.equals(langName, language.langName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(langId, langName, langProf);
    }

    @Override
    public String toString() {
        return "Language{" +
                "langId=" + langId +
                ", langName='" + langName + '\'' +
                ", langProf=" + langProf +
                '}';
    }
}
