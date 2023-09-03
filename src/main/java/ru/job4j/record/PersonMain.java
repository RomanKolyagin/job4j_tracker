package ru.job4j.record;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person("Роман", 25);
        System.out.println("Имя " + person.getName() + ", Возраст " + person.getAge());
        System.out.println(person);
        PersonRecord record = new PersonRecord("Иван", 30);
        System.out.println("Имя: " + record.name() + ", Возраст: " + record.age());
        System.out.println(record);
        PersonRecord record1 = new PersonRecord(record.name(), 30);
        System.out.println(record.equals(record1));
    }
}
