package basicmethod;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    private FileOutputStream fileOutputStream;

    public FileOutputStreamDemo() {
        try {
            this.fileOutputStream = new FileOutputStream("D:\\Education\\Tanver\\File Data.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void write() {
        try {
            String st = "I am Tanver Ahammed Aminul Bari";

            byte []bytes = st.getBytes();

            this.fileOutputStream.write(bytes);
            this.fileOutputStream.write(27);
            this.fileOutputStream.close();

            System.out.println("FileOutputStream Successfully!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
