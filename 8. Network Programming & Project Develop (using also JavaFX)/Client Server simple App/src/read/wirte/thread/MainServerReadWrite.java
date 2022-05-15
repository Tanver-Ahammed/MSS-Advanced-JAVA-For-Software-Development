package read.wirte.thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServerReadWrite {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(22222);
        System.out.println("Server started......");
        while (true) {
            System.out.println("Client connected......");
            Socket socket = serverSocket.accept();

            // new server Thread start
            new ServerThreadReadWrite(socket);
        }

    }

}
