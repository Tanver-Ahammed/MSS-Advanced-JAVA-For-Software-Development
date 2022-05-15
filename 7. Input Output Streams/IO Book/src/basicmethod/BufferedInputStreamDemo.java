package basicmethod;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamDemo {
    private BufferedInputStream bufferedInputStream;

    public BufferedInputStreamDemo() {
        try {
            this.bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\Education\\Tanver\\Buffer Data.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void bufferRead() {
        try {
            int data;
            while ((data = this.bufferedInputStream.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
