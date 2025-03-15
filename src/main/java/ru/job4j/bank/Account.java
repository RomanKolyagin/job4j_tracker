package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает банковский счет,
 * который характеризуется реквизитами и балансом.
 * @author Roman Kolyagin
 * @version 1.0
 */
public class Account {
    /**
     * Реквизиты счета в формате строки
     */
    private String requisite;
    /**
     * Баланс счета
     */
    private double balance;

    /**
     * Создание счета пользователя
     * @param requisite реквизиты счета
     * @param balance баланс на счете
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод позволяет получить реквизиты счета
     * @return requisite реквизиты счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод позволяет присваивать реквизиты счета
     * @param requisite реквизиты счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод позволяет получить баланс счета
     * @return balance баланс счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод позволяет присвоить баланс счета
     * @return balance баланс счета
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод принимает объект и позволяет сравнить его с текущим
     * @param o входящий объект
     * @return вернет true, если объекты равны. В противном случае - false
     * Возвращает результат сравнения по реквизиту счета
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод возвращает хеш-код реквизитов счета
     * @return возвращает хеш-код реквизитов счета
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}