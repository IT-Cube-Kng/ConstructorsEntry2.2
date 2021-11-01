package ru.itschool.module22;

import bank.client.Client;

import java.sql.SQLOutput;

public class Bank {
    long money;
    static int ids[];

    static {
        ids = new int[]{42, 24, 222, 333};
    }



    public Bank(int money) {
        this.money = money;
    }

    public String getBalance(Client c) {
        for (int id : ids) {
            if (id == c.getId(this)) return String.valueOf(money);
        }
        return "";
    }





}


