package ru.job4j.cast;

public class PolyUsage {

    public static void main(String[] args) {
        Vehicle air = new Air();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle[] vehicles  = {air, bus, train};
        for (Vehicle v : vehicles) {
            v.info();
            v.move();
        }
    }
}