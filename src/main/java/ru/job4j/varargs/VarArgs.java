package ru.job4j.varargs;

public class VarArgs {
    public static String text(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            builder.append(string);
        }
        return builder.toString();
    }

    public static String text(int x, String... strings) {
        StringBuilder builder = new StringBuilder();
        builder.append(x);
        for (String string : strings) {
            builder.append(string);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(text());
        System.out.println(text("aaa"));
        System.out.println(text("aaa", "bbb", "ccc"));
        System.out.println(text(30, "aaa", "bbb"));
    }
}