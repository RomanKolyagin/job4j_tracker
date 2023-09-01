package ru.job4j.inheritance;

public class Format {

    public static void getGreeting(String name, int age) {
        System.out.println(String.format("Привет! Я %s, мой возраст: %s", name, age));    }

    public static void main(String[] args) {
        getGreeting("Elena", 28);
    }
}