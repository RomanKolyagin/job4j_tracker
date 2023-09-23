package ru.job4j.cast;

public class Bus implements Vehicle {

    @Override
    public void info() {
        System.out.println("Информация о автобусе");
    }

    @Override
    public void move() {
        System.out.println("Автобус двигается по скоростным трассам");
    }
}
