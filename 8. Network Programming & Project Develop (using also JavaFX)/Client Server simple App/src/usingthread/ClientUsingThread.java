package usingthread;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientUsingThread {
    public static void main(String[] args) throws IOException {

        System.out.println("Client started.....");
        Socket socket = new Socket("127.0.0.1", 22222);

        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Client enter the input: ");
            String massage = scanner.nextLine();

            if (massage.equalsIgnoreCase("exit"))
                break;
            // sent to server
            oos.writeObject(massage);

            try {
                Object fromServer = ois.readObject();
                System.out.println("From server: " + (String) fromServer);
            } catch (ClassNotFoundException e) {
                System.err.println("Client Error");
            }

        }
    }
}