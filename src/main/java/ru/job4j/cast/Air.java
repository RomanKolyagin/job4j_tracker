package ru.job4j.cast;

public class Air implements Vehicle {

    @Override
    public void info() {
        System.out.println("Информация о самолете");
    }

    @Override
    public void move() {
        System.out.println("Самолет летает по воздуху");
    }
}