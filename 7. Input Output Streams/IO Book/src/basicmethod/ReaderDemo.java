package basicmethod;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {
    Reader reader;

    public void read() {
        try {
            this.reader = new FileReader("D:\\Education\\Tanver\\writer.txt");

            int data;
            while ((data = this.reader.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
