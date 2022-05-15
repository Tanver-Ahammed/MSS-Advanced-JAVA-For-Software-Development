package basicmethod;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    private ByteArrayOutputStream byteArrayOutputStream;
    private FileOutputStream fos1;
    private FileOutputStream fos2;

    public ByteArrayOutputStreamDemo() {
        try {
            this.fos1 = new FileOutputStream("D:\\Education\\Tanver\\fos1.txt");
            this.fos2 = new FileOutputStream("D:\\Education\\Tanver\\fos2.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void byteArrayWrite() {
        this.byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            String st = "I am Tanver Ahammed 65";
            byte []bytes = st.getBytes();
            this.byteArrayOutputStream.write(bytes);
            this.byteArrayOutputStream.writeTo(fos1);
            this.byteArrayOutputStream.writeTo(fos2);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
