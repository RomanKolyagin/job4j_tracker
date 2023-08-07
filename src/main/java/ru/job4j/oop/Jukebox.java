package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String rsl = switch (position) {
            case 1 -> "Пусть бегут неуклюже";
            case 2 -> "За день мы устали очень";
            default -> "Песня не найдена";
        };
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(10);
    }
}