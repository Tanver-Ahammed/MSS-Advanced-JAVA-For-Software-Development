package networking;

import sample.Controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class TCPClient extends Thread {

    private Controller controller;
    Socket socket;
    ObjectInputStream ois;
    ObjectOutputStream oos;
    long start,end;
    int port = 22222;

    public TCPClient(Controller controller) {
        this.controller = controller;
        try {
            this.socket = new Socket("localhost",this.port);
            this.oos = new ObjectOutputStream(this.socket.getOutputStream());
            this.ois = new ObjectInputStream(this.socket.getInputStream());
            this.controller.setOos(this.oos);

        } catch (IOException e) {
            System.err.println("Error");
        }
    }

    @Override
    public void run() {

    }
}






















