package randomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFile extends Thread {
    RandomAccessFile randomAccessFile;

    public RAFile() {
        try {
            this.randomAccessFile =  new RandomAccessFile("./sample.txt","rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

    }

    public void write() {
        byte []data = new byte[5];
        try {
            this.randomAccessFile.writeBytes("\nTanver Ahammed\n");

            this.randomAccessFile.seek(512);
            this.randomAccessFile.writeBytes("\nskipping 512 bytes\n");
            this.randomAccessFile.writeInt(27);
            this.randomAccessFile.write(27);

            this.randomAccessFile.seek(512 + 2048);
            this.randomAccessFile.writeBytes("\nskipping 2048 bytes after last write\n");
            this.randomAccessFile.writeBytes("\nKaitahar, Joypurhat\n");

            this.randomAccessFile.setLength(4096  * 1024);

            this.randomAccessFile.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }












}
