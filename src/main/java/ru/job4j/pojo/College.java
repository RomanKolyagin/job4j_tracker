package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Roman Kolyagin");
        student.setRoomGroup("4");
        student.setData(new Date());

        System.out.println(student.getFullName() + " is placed into group # " + student.getRoomGroup() + " on " + student.getData());
    }
}