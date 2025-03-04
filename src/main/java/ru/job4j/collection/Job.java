package ru.job4j.collection;

public class Job implements Comparable<Job> {
    private String name;
    private int priority;

    public Job(String name, int score) {
        this.name = name;
        this.priority = score;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" + name + ", " + priority + '}';
    }

    @Override
    public int compareTo(Job o) {
        return Integer.compare(priority, o.priority);
    }
}