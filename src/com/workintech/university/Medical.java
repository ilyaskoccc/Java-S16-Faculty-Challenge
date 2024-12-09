package com.workintech.university;

import java.util.Set;

public class Medical extends Department {
    public Medical(long id, String name, String departmentHead, Faculty faculty) {
        super(id, name, departmentHead, faculty);
    }

    @Override
    public Set<Course> lessonToLearn() {
        return getCourses();
    }
}
