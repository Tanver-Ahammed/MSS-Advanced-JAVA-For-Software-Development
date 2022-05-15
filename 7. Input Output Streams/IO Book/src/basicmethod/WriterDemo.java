package basicmethod;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    Writer writer;

    public void write() {
        try {
            this.writer = new FileWriter("D:\\Education\\Tanver\\writer.txt");
            String st = "I am a Bangladeshi.";


            this.writer.write(st);
            this.writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
