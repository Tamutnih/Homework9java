package com.example;

import java.util.ArrayList;
import java.util.ListIterator;

/*  Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях. Он реализует интерфейс ListIterator<Student>.
Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.
 */
public class GroupListIterator {
    public static void main(String[] args) {

        ArrayList<String> listStudents = new ArrayList<String>();

        ListIterator<String> listIter = listStudents.listIterator();
        while (listIter.hasNext()) {

            System.out.println(listIter.next());
        }
        while (listIter.hasPrevious()) {

            System.out.println(listIter.previous());
        }
    }

}
