package read.wirte.thread;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MainClientReadWrite {
    public static void main(String[] args) throws IOException {
        System.out.println("Client started......");
        Socket socket = new Socket("127.0.0.1",22222);
        System.out.println("Client connected.....");

        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

        new WriterThread(oos, "Client-1");
        new ReaderThread(ois, "Client-1");

//        socket.close();
    }
}
