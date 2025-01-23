package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime currentDate = item.getCreated();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(String.format("Текущая дата: %s", currentDate.format(dateTimeFormatter)));
        Item itemVerifyToString = new Item(45, "Pavlov");
        System.out.println(itemVerifyToString);
    }
}
