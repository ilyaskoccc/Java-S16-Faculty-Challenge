package com.workintech.university;

import java.util.Objects;

public class Instructor {
    private long id;
    private String firstName;
    private String lastName;
    private double salary;
    private boolean hasMsc;
    private boolean hasPhd;

    public Instructor(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instructor that = (Instructor) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
