package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println("The cat " + this.name + " was eating " + this.food);;
    }

    public void eat(String meat) {
        this.food = meat;
    }
    public void giveNick(String nick) {
        this.name = nick;
    }


    public static void main(String[] args) {
        Cat black = new Cat();
        black.giveNick("Barsik");
        black.eat("fish");
        black.show();
    }
}