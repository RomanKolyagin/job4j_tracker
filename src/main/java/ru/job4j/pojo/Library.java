package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book chapterOne = new Book("Chapter One", 106);
        Book chapterTwo = new Book("Chapter Two", 71);
        Book chapterThree = new Book("Chapter Three", 83);
        Book chapterFour = new Book("Chapter Clean Code", 95);
        Book[] books = {chapterOne, chapterTwo, chapterThree, chapterFour};
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + ", number of pages " + book.getPages());
        }
        System.out.println("---After replacing 0 and 3 book---");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + ", number of pages " + book.getPages());
        }
        System.out.println("---Searching book with name---");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Chapter Clean Code".equals(book.getName())) {
                System.out.println(book.getName() + ", number of pages: " + book.getPages());
            }
        }
    }
}