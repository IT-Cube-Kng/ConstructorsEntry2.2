package bank.client;

import ru.itschool.module22.Bank;

import java.util.Random;

public class Client {
    private int id;


    public Client() {
        Random r = new Random();

        id = r.nextInt(100000);
    }

    public Client(int id) {
        this.id = id;
    }


    public int getId(Bank b) {

        if (b instanceof Bank) return id;
        return 0;
    }

    public void setId(int id) {

        this.id = id;
    }
}
