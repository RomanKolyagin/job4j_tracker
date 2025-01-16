package ru.job4j.oop;

public class Error {
    private String message;
    private int status;
    private boolean active;

    public Error() { }

    public Error(String message, int status, boolean active) {
        this.message = message;
        this.status = status;
        this.active = active;
    }

    public void printInfo() {
        System.out.println("message: " + message);
        System.out.println("status: " + status);
        System.out.println("active: " + active);
    }

    public static void main(String[] args) {
        Error errorDefault = new Error();
        errorDefault.printInfo();
        Error error = new Error("Error", 404, false);
        error.printInfo();
    }
}