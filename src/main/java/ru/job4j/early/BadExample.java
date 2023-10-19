package ru.job4j.early;

import java.util.ArrayList;
import java.util.List;

public class BadExample {

    private static final double COMPARING_PRECISION = 1.e-5;

    public static List<Double> calculateInverseProportionality(double k, double x1, double x2, int n) {
        if (!isEquals(k, 0)) {
            if (n > 0) {
                if (k > 0 && x1 < x2) {
                    return calculateFunction(k, x1, x2, n);
                } else if (k < 0 && x2 < x1) {
                    return calculateFunction(k, x2, x1, n);
                } else if (isEquals(x1, x2)) {
                    if (n == 1) {
                        return List.of(k / x1);
                    } else {
                        throw new IllegalArgumentException("n suppose more than one point, but range include one point");
                    }
                } else {
                    throw new IllegalArgumentException("k is not consistent with x1 and x2");
                }
            } else {
                throw new IllegalArgumentException("'n' must be more than 0");
            }
        } else {
            throw new IllegalArgumentException("'k' must be more than 0");
        }
    }

    private static boolean isEquals(double a, double b) {
        return Math.abs(a - b) < COMPARING_PRECISION;
    }

    private static List<Double> calculateFunction(double k, double x1, double x2, int n) {
        List<Double> result = new ArrayList<>(n);
        double step = (x2 - x1) / n;
        for (int i = 0; i < n; i++) {
            double xi = x1 + i * step;
            double yi = k / xi;
            result.add(yi);
        }
        return result;
    }
}