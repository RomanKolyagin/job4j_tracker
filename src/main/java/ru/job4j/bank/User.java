package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает пользователя банка
 * @author Roman Kolyagin
 * version 1.0
 */
public class User {
    /**
     * Паспорт пользователя
     */
    private String passport;

    /**
     * Имя пользователя
     */
    private String username;

    /**
     * Создание пользователя
     * @param passport номер паспорта пользователя
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод позволяет получать паспорт пользователя
     * @return паспорт пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод принимает объект и позволяет сравнить его с текущим
     * @param o входящий объект
     * @return вернет true, если объекты равны. В противном случае - false
     * Возвращает результат сравнения по паспорту пользователя
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод возвращает хеш-код паспорта пользователя
     * @return возвращает хеш-код паспорта пользователя
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}