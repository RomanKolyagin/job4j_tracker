package ru.job4j.record;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Роман", 27);
        System.out.println("Имя: " + person.getName() + ", Возраст: " + person.getAge());
        System.out.println(person);
        PersonRecord record = new PersonRecord("Роман", 27);
        System.out.println("Имя: " + record.name() + ", Возраст: " + record.age());
        System.out.println(record);
        PersonRecord record1 = new PersonRecord("Роман", 27);
        System.out.println(record.equals(record1));
        PersonRecord newRecord = new PersonRecord(record.name(), 35);
        System.out.println(newRecord);
    }
}