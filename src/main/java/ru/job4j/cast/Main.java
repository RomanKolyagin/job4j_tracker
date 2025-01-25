package ru.job4j.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle air = new Air();
        Vehicle bass = new Bass();
        Vehicle train = new Train();
        Vehicle[] vehicleAll = {air, bass, train};
        for (Vehicle vehicle : vehicleAll) {
            vehicle.move();
            vehicle.passengers();
        }
    }
}