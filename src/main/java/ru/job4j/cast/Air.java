package ru.job4j.cast;

public class Air implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает по воздуху");
    }

    @Override
    public void passengers() {
        System.out.println("Количество допустимых пассажиров = 120");
    }
}
