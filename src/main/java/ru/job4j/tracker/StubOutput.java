package ru.job4j.tracker;

public class StubOutput implements Output {
    private final StringBuilder builder = new StringBuilder();

    @Override
    public void println(Object obj) {
        if (obj != null) {
            builder.append(obj.toString());
        } else {
            builder.append("null");
        }
        builder.append(System.lineSeparator());
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}
