package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("I am not alive");
        } else {
            System.out.println("I am alive");
        }
    }
}