package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("romank@mail.ru", "Kolyagin Roman Olegovich");
        map.put("romank@gmail.com", "Serv Roman Olegovich");
        map.put("romank@bk.ru", "Deryabin Roman Olegovich");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Email: " + entry.getKey() + " name: " + entry.getValue());
        }
    }
}