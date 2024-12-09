package com.workintech.university;

import java.util.Comparator;

public class CourseSortedByID  implements Comparator<Course> {
    @Override
    public int compare(Course course, Course t1) {
        return Long.compare(course.getId(), t1.getId());
    }
}
