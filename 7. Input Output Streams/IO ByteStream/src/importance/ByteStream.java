package importance;

import java.io.*;

public class ByteStream extends Thread {
    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;

    BufferedInputStream bufferedInputStream;
    BufferedOutputStream bufferedOutputStream;

    public ByteStream(String fileName) {
        try {
            this.fileInputStream = new FileInputStream("original_files/" + fileName);
            this.fileOutputStream = new FileOutputStream("copy_files/Copy_of_" + fileName);

            this.bufferedInputStream = new BufferedInputStream(new FileInputStream("original_files/" + fileName),40960);
            this.bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("copy_buffers/Copy_" + fileName), 40960);


        } catch (IOException e) {
            System.out.println("Specified File not found!");
        }
    }

    @Override
    public void run() {
        int singleByte;
        try {
            long startTime = System.currentTimeMillis();

            while ((singleByte = this.fileInputStream.read()) != -1) {
                // we can do any operation / modification on singleByte individually
                this.fileOutputStream.write(singleByte);
            }

            long endTime = System.currentTimeMillis();
            System.out.println("File I/O: " + (endTime - startTime));

            // ----------------------------------------------------------------------------------

            startTime = System.currentTimeMillis();

            while ((singleByte = this.bufferedInputStream.read()) != -1) {
                // we can do any operation / modification on singleByte individually
                this.bufferedOutputStream.write(singleByte);
            }

            endTime = System.currentTimeMillis();
            System.out.println("Buffered I/O: " + (endTime - startTime));





            this.fileInputStream.close();
            this.fileOutputStream.close();

            this.bufferedOutputStream.close();
            this.bufferedInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


/*    @Override
    public void run() {
        byte[] bytes = new byte[4096];
        try {
            //bytes = this.fileInputStream.readAllBytes();

            while (this.fileInputStream.read(bytes) != -1) {
                this.fileOutputStream.write(bytes);
                System.out.println(bytes);
            }

            this.fileInputStream.close();
            this.fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/



}