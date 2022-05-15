package nonthread;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientNonThread {
    public static void main(String[] args) throws IOException {


        System.out.println("Client started...");
        Socket socket = new Socket("127.0.0.1", 22222);
        System.out.println("Client connected.");

        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Client enter the input: ");
        String massage = scanner.nextLine();

        // sent to server
        oos.writeObject(massage);

        try {
            Object fromServer = ois.readObject();
            System.out.println("From server: " + (String) fromServer);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}