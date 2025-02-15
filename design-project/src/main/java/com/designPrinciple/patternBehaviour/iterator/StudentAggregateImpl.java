package com.designPrinciple.patternBehaviour.iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentAggregateImpl implements Aggregate<Student> {

    private List<Student> list = new ArrayList<>();

    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void remove(Student student) {
        list.remove(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIteratorImpl(list);
    }
}
