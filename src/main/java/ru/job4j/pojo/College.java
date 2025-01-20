package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Roman");
        student.setSurname("Kolyagin");
        student.setGroup(4);
        student.setDate(new Date());
        System.out.println(student.getName() + " " + student.getSurname()
                + " " + student.getGroup() + " " + student.getDate());
    }
}