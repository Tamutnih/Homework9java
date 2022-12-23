package com.example;

import java.time.LocalDate;

/**
 * 1. Класс Группа содержит в себе коллекцию Студентов. По группе можно
 * перемещаться с помощью итератора. (Это повторяет 1-ю задачу из классной
 * работы). Остальные задачи надстраиваются поверх неё.
 */
public class Student {

    public Student(String name, LocalDate date, float averageMark) {
        this.name = name;
        this.date = date;
        this.averageMark = averageMark;
    }

    private String name;
    private LocalDate date;
    private float averageMark;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", averageMark=" + averageMark +
                '}';
    }

}
