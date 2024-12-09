package com.workintech.university;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty {
    private long id;
    private String name;
    private String createdDate;
    private String address;
    private String dean;
    private List<Department> departments;

    public Faculty(long id, String name, String createdDate, String address, String dean){
        this.id = id;
        this.name = name;
        this.createdDate = createdDate;
        this.address = address;
        this.dean = dean;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) throws Exception {
        if(!this.equals(department.getFaculty()))
            throw new Exception("Farkli fakultedeki departman buraya eklenemez");
        this.departments.add(department);
    }

    public List<Department> getDepartments(){
        return this.departments;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return id == faculty.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
