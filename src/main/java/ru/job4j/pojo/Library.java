package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book chapterOne = new Book("Chapter One", 125);
        Book chapterTwo = new Book("Chapter Two", 125);
        Book chapterThree  = new Book("Chapter Three", 125);
        Book chapterFour = new Book("Clean code", 125);
        Book[] books = new Book[] {chapterOne, chapterTwo, chapterThree, chapterFour};
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " " + book.getPage());
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " " + book.getPage());
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " " + book.getPage());
            }
        }
    }
}