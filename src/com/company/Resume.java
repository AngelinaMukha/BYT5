package com.company;

import java.util.Date;

public class Resume {
    private final String name;
    private final String surname;
    private String skills;
    private String shortDescription;
    private String languages;
    private boolean hasExpirience = false;
    private int expirience=0;

    private Resume(ResumeBuilder resumeBuilder) {
        this.name = resumeBuilder.name;
        this.surname = resumeBuilder.surname;
        this.skills = resumeBuilder.skills;
        this.shortDescription = resumeBuilder.shortDescription;
        this.languages = resumeBuilder.languages;
        this.hasExpirience=resumeBuilder.hasExpirience;
        this.expirience=resumeBuilder.expirience;

    }

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getSkills(){
        return this.skills;
    }
    public String getShortDescription(){
        return this.shortDescription;
    }
    public String getLanguages(){
        return this.languages;
    }
    public boolean getHasExpirience(){
        return this.hasExpirience;
    }
    public int getExpirience(){
        return this.expirience;
    }
    @Override
    public String toString() {
        return "Task: "+this.name+", "+this.surname+", "+this.skills+", "+this.shortDescription+", "+this.languages+", "+hasExpirience+", "+expirience;
    }

    public static class ResumeBuilder
    {
        private final String name;
        private final String surname;
        private String skills;
        private String shortDescription;
        private String languages;
        private boolean hasExpirience;
        private int expirience=0;

        public ResumeBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
//        public ResumeBuilder(String name, String surname, String skills, String shortDescription, String languages,
//                             boolean hasExpirience, int expirience) {
//            this.name = name;
//            this.surname = surname;
//            this.skills = skills;
//            this.shortDescription = shortDescription;
//            this.languages = languages;
//            this.hasExpirience=hasExpirience;
//            this.expirience=expirience;
//        }
        public ResumeBuilder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public ResumeBuilder languages(String languages) {
            this.languages = languages;
            return this;
        }
        public ResumeBuilder hasExpirience(boolean hasExpirience) {
            this.hasExpirience = hasExpirience;
            return this;
        }
        public ResumeBuilder skills(String skills) {
            this.skills = skills;
            return this;
        }

        public Resume build() {
            Resume resume =  new Resume(this);
            return resume;
        }

    }
}
