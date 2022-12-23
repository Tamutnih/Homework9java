package com.example;

import java.util.Iterator;

/*Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
• Он отслеживает текущую позицию в переборе
• Он изначально выставлен на конечную позицию
• Он движется справа налево
Проверьте, как он работает. */
// public static void main(String[] args) {
// List<String> list = Arrays.asList();

// ReverseListIterator itr = new ReverseListIterator();

// while (itr.hasNext()) {
// System.out.println(itr.hasNext());
// }
// }
public class ReverseIterator implements Iterator<Student> {

    private StudentGroup studentGroup;
    private int index;

    public void StudentGroupReverseIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.index = studentGroup.getSize();
    }

    public boolean hasNext() {
        return index > 0;
    }

    public Student next() {
        return studentGroup.get(--index);
    }
}
