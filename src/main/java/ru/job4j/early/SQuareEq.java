package ru.job4j.early;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class SQuareEq {

    private static final double COMPARING_PRECISION = 1.e-5;

    public static List<Double> solve(double a, double b, double c) {
        if (isEquals(a, 0)) {
            throw new IllegalArgumentException("Square equation must have a > 0");
        }
        double discriminant = b * b - 4 * a * c;
        List<Double> squares = new ArrayList<>();
        if (isEquals(discriminant, 0)) {
            squares.add(-b / 2 * a);
        } else {
            squares.add((-b - sqrt(discriminant)) / 2 * a);
            squares.add((-b + sqrt(discriminant)) / 2 * a);
        }
        return squares;
    }

    private static boolean isEquals(double a, double b) {
        return Math.abs(a - b) < COMPARING_PRECISION;
    }
}
