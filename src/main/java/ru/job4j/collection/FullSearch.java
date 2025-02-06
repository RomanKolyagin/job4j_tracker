package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearch {
    public Set<String> extractNumber(List<Task> tasks) {
        Set<String> numbers = new HashSet<>();
        for (Task task : tasks) {
            numbers.add(task.getNumber());
            numbers.add(task.getDescription());
        }
        return numbers;
    }
}