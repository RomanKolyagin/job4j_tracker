package ru.job4j.oop;

public class Student {
    public void music(String lyrics) {
        System.out.println("I can sing a song : " + lyrics);
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music("Tra ta ta ta ta");
        Student roman = new Student();
        roman.music("Purum purum");
    }
}