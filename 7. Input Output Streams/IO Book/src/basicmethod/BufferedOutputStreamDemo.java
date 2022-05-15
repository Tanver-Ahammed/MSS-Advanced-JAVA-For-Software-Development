package basicmethod;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    private BufferedOutputStream bufferedOutputStream;

    public BufferedOutputStreamDemo() {
        try {
            this.bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\Education\\Tanver\\Buffer Data.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void bufferWrite() {

        String st = "This Buffered Output Stream.";

        try {
            byte []bytes = st.getBytes();
            this.bufferedOutputStream.write(bytes);
            this.bufferedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
