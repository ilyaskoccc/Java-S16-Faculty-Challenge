package com.workintech.university;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//concrete
public class ComputerEngineering extends Department{
    private List<String> programmingLanguageShouldBeTaught;

    public ComputerEngineering(long id, String name, String departmentHead, Faculty faculty){
        super(id, name, departmentHead, faculty);
        programmingLanguageShouldBeTaught = new ArrayList<>();
    }

    @Override
    public Set<Course> lessonToLearn(){
        return getCourses();
    }

    public void addProgrammingLanguageShouldBeTaught(String language){
        this.programmingLanguageShouldBeTaught.add(language);
    }
}
