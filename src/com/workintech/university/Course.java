package com.workintech.university;

import java.util.List;
import java.util.Objects;

public class Course implements Comparable<Course> {
    private long id;
    private String name;
    private double gpa;
    private Department department;
    private List<Instructor> instructors;

    public Course(long id, String name, double gpa, Department department) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.department =department;
    }

    public Department getDepartment() {
        return department;
    }

    public void addInstructor(Instructor instructor) {
        if(!instructors.contains(instructor)){
            instructors.add(instructor);
        }
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Course course) {
        return this.name.compareTo(course.getName());
    }

    @Override
    public String toString() {
        return "ID: " + this.id;
    }
}
