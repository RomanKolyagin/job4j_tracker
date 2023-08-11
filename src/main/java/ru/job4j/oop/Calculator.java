package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int value) {
        return value + x;
    }

    public static int minus(int value) {
        return value - x;
    }

    public int multiply(int value) {
        return value * x;
    }

    public int divide(int value) {
        return value / x;
    }

    public int sumAllOperation(int value) {
        return sum(value) + minus(value) + multiply(value) + divide(value);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(minus(10));

        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(5));
        System.out.println(calculator.divide(10));
        System.out.println(calculator.sumAllOperation(10));
    }
}