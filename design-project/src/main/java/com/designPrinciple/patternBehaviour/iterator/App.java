package com.designPrinciple.patternBehaviour.iterator;

public class App {
    public static void main(String[] args) {
        StudentAggregateImpl aggregate = new StudentAggregateImpl();
        aggregate.add(new Student("zs", 2));
        aggregate.add(new Student("ls", 3));
        aggregate.add(new Student("ww", 4));
        Iterator<Student> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
    }
}
