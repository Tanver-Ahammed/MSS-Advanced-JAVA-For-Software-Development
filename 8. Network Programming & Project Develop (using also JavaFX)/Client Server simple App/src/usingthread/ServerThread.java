package usingthread;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread implements Runnable {

    Socket clientSocket;
    Thread thread;
    public ServerThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
        this.thread = new Thread(this);
        this.thread.start();
    }

    @Override
    public void run() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());

            while (true) {
                // read from client
                Object clientMassage = ois.readObject();
                if (clientMassage == null)
                    break;
                System.out.println("From Client: " + (String) clientMassage);

                String serverMassage = (String) clientMassage;
                serverMassage = serverMassage.toUpperCase();

                // sent to client
                oos.writeObject(serverMassage);

            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Server Error");
        }
        try {
            this.clientSocket.close();
        } catch (IOException e) {
            System.err.println("Server Error");
        }
    }
}
