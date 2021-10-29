package ru.itschool.module22;

import bank.client.Client;

public class Bank {
    long money;
    int ids[] = new int[5];


    public Bank(int money) {
        this.money = money;
    }

    public String getBalance(Client c) {
        for (int id : ids) {
            if (id == c.id) return String.valueOf(money);
        }
        return "";
    }


}
