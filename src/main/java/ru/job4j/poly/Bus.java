package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Необъодимо оплатить проезд.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров: " + count);
    }

    @Override
    public double refuel(double fuel) {
        return fuel * 60;
    }
}