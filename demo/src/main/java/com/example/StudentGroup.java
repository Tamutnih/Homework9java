package com.example;
/*Итератор */

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {

    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public int getSize() {
        return this.students.size();
    }

    public Student get(int index) {
        return students.get(index);
    }

    public Iterator<Student> Iterator() {
        return new StudentGroupIterator(this);
    }

    public java.util.Iterator<Student> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
}