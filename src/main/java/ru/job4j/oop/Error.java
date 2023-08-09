package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error errorDefault = new Error();
        errorDefault.printInfo();
        System.out.println();
        Error error = new Error(true, 1, "Online");
        error.printInfo();
    }
}
