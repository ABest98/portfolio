package com.techelevator.model;

import java.util.Objects;

public class Language {

    private int langId;
    private String langName;
    private String langDesc;

    public Language() {
        
    }

    public Language(int langId, String langName, String langDesc) {
        this.langId = langId;
        this.langName = langName;
        this.langDesc = langDesc;
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

    public String getLangDesc() {
        return langDesc;
    }

    public void setLangDesc(String langDesc) {
        this.langDesc = langDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language language = (Language) o;
        return langId == language.langId && Objects.equals(langName, language.langName) && Objects.equals(langDesc, language.langDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(langId, langName, langDesc);
    }

    @Override
    public String toString() {
        return "Language{" +
                "langId=" + langId +
                ", langName='" + langName + '\'' +
                ", langDesc='" + langDesc + '\'' +
                '}';
    }
}
