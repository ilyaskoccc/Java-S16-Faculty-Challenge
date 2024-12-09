package com.workintech.university;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public abstract class Department {
    private long id;
    private String name;
    private String departmentHead;
    private Faculty faculty;
    private Set<Course> courses;

    public Department(long id, String name, String departmentHead, Faculty faculty) {
        this.id = id;
        this.name = name;
        this.departmentHead = departmentHead;
        this.faculty = faculty;
        this.courses = new TreeSet<>();
    }

    public String getName() {
        return this.name;
    }

    public Faculty getFaculty() {
        return this.faculty;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        if(!this.equals(course.getDepartment()))
            return;
        this.courses.add(course);
    }

    public abstract Set<Course> lessonToLearn();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
