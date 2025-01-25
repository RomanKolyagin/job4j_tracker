package ru.job4j.cast;

public class Bass implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " ездит по дороге");
    }

    @Override
    public void passengers() {
        System.out.println("Количество допустимых пассажиров = 20");
    }
}