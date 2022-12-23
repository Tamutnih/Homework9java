package com.example;

/* Перебор с помощью итератора */
import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {

    private int index = -1;
    private StudentGroup studentGroup;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public boolean hasNext() {
        return index < studentGroup.getSize() - 1;
    }

    public Student next() {
        return studentGroup.get(++index);
    }
}