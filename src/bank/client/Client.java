package bank.client;

import java.util.Random;

public class Client {
    public int id;


    public Client() {
        Random r = new Random();

        id = r.nextInt(100000);
    }


    public Client(int id) {
        this.id = id;
    }

}
