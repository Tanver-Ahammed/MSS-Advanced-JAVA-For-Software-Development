package basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream extends Thread {
    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;

    public ByteStream(String fileName) {
        try {
            this.fileInputStream = new FileInputStream("original_files/"+fileName);
            this.fileOutputStream = new FileOutputStream("copy_files/Copy_of_"+fileName);

        } catch (IOException e) {
            System.out.println("Specified File not found!");
        }
    }

    @Override
    public void run() {
        byte[] bytes = new byte[4096];
        try {
            //bytes = this.fileInputStream.readAllBytes();

            while (this.fileInputStream.read(bytes) != -1) {
                this.fileOutputStream.write(bytes);
            }

            this.fileInputStream.close();
            this.fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}