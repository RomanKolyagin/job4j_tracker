package ru.job4j.early;

import java.util.ArrayList;
import java.util.List;

public class GoodExample {

    private static final double COMPARING_PRECISION = 1.e-5;

    public static List<Double> calculateInverseProportionality(double k, double x1, double x2, int n) {
        if (isEquals(k, 0)) {
            throw new IllegalArgumentException("'k' must be more than 0");
        }
        if (n <= 0) {
            throw new IllegalArgumentException("'n' must be more than 0");
        }
        if (k > 0 && x1 > x2 || k < 0 && x2 < x1) {
            throw new IllegalArgumentException("k is not consistent with x1 and x2");
        }
        if (isEquals(x1, x2) && n > 1) {
            throw new IllegalArgumentException("n suppose more than one point, but range include one point");
        }
        return calculateFunction(k, Math.min(x1, x2), Math.max(x1, x2), n);
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