package read.wirte.thread;

import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderThread implements Runnable {

    private ObjectInputStream ois;
    private String name;

    public ReaderThread(ObjectInputStream ois, String name) {
        this.ois = ois;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                // receive from server.....
                Object received = ois.readObject();
                System.out.println(this.name + " Got: " + (String) received);
            } catch (ClassNotFoundException | IOException e) {
                System.err.println("Client Error");
            }
        }
    }
}