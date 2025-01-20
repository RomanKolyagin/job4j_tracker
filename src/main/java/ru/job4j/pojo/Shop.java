package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        for (int index = 0; index < products.length; index++) {
            if (products[index] == null) {
                return index;
            } else {
                System.out.println(products[index]);
            }
        }
        return -1;
    }
}