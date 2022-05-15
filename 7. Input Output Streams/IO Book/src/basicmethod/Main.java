package basicmethod;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileOutputStreamDemo fileOutputStreamDemo = new FileOutputStreamDemo();
        fileOutputStreamDemo.write();

        FileInputStreamDemo fileInputStreamDemo = new FileInputStreamDemo();
        fileInputStreamDemo.read();

        BufferedOutputStreamDemo bufferedOutputStreamDemo = new BufferedOutputStreamDemo();
        bufferedOutputStreamDemo.bufferWrite();

        BufferedInputStreamDemo bufferedInputStreamDemo = new BufferedInputStreamDemo();
        bufferedInputStreamDemo.bufferRead();

        ByteArrayOutputStreamDemo byteArrayOutputStreamDemo = new ByteArrayOutputStreamDemo();
        byteArrayOutputStreamDemo.byteArrayWrite();

        WriterDemo writer = new WriterDemo();
        writer.write();

        ReaderDemo readerDemo = new ReaderDemo();
        readerDemo.read();

    }
}
