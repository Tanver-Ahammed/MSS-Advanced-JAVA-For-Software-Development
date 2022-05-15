import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) throws IOException {

        File directory = new File("original_files");

        FileWriter fileWriter = null;

        try {
//            fileWriter = new FileWriter("sequential_runtimes.txt", true);        // For sequential operation
            fileWriter = new FileWriter("concurrent_runtimes.txt", true);          // For concurrent operation
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (directory.isDirectory()) {
            List<Encryption> threadObject = new LinkedList<>();
            long startTime = System.currentTimeMillis();
            for (File file : directory.listFiles()) {
                Encryption fileEncryption = new Encryption(file.getName());
//                fileEncryption.run();            // For sequential operation
                fileEncryption.start();            // For concurrent operation
                threadObject.add(fileEncryption);
            }

            for (Encryption enc : threadObject) {
                try {
                    enc.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            long endTime = System.currentTimeMillis();
            System.out.println("Encryption complete..........");
            fileWriter.write((endTime-startTime)/1000.0 + "\n");
            fileWriter.close();
        }
    }
}
