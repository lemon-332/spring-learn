package com.designPrinciple.patternBehaviour.iterator;

import java.util.List;

public class StudentIteratorImpl implements Iterator<Student> {

    private List<Student> students;

    public StudentIteratorImpl(List<Student> students) {
        this.students = students;
    }

    private int index;

    @Override
    public Student next() {
        return students.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < students.size();
    }
}
