package nonthread;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerNonThread {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(22222);
        System.out.println("Server started...");

        while (true) {
            System.out.println("Client connected.");
            Socket socket = serverSocket.accept();
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            try {
                // read from client
                Object clientMassage = ois.readObject();
                System.out.println("From client " + (String) clientMassage);

                String serverMassage = (String) clientMassage;

                serverMassage = serverMassage.toUpperCase();

                // sent to client
                oos.writeObject(serverMassage);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}




















