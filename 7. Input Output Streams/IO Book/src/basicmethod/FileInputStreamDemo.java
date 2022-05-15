package basicmethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    private FileInputStream fileInputStream;

    public FileInputStreamDemo() {
        try {
            this.fileInputStream = new FileInputStream("D:\\Education\\Tanver\\File Data.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void read() {
        try {
            int data ;
            while ((data = this.fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }
            this.fileInputStream.close();
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
