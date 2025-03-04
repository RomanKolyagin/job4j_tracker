package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] s1 = o1.split("\\.");
        String[] s2 = o2.split("\\.");
        int minLength = Math.min(s1.length, s2.length);
        for (int i = 0; i < minLength; i++) {
            int num1 = Integer.parseInt(s1[i]);
            int num2 = Integer.parseInt(s2[i]);

            if (num1 < num2) {
                return -1;
            } else if (num1 > num2) {
                return 1;
            } else {
                return 0;
            }
        }
        return Integer.compare(s1.length, s2.length);
    }
}