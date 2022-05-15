package read.wirte.thread;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class WriterThread implements Runnable {

    private ObjectOutputStream oos;
    private String name;

    public WriterThread(ObjectOutputStream oos, String name) {
        this.oos = oos;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter client input: ");
            String massage = scanner.nextLine();
            try {
                oos.writeObject(massage);
                System.out.println("Massage sent....");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
