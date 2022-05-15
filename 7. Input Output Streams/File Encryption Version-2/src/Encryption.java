import java.io.*;
import java.util.Locale;

public class Encryption extends Thread {
    private FileReader fileReader;
    private FileWriter fileWriter;

    BufferedReader br;
    PrintWriter pw;
    BufferedWriter bw;

    public Encryption(String fileName) {
        try {
            this.fileReader = new FileReader("original_files/" + fileName);
            this.fileWriter = new FileWriter("encrypted_files/" + fileName);

            this.br = new BufferedReader(this.fileReader);
//            this.pw = new PrintWriter(this.fileWriter);
            this.pw = new PrintWriter(new BufferedWriter(this.fileWriter));

        } catch (IOException e) {
            System.out.println("File is not Found!!");
        }
    }

    @Override
    public void run() {
        String line;
        try {
            while ((line = this.br.readLine()) != null) {
                long startTime = System.nanoTime();
                this.pw.println(line.toUpperCase(Locale.ROOT));
                this.pw.println(line.toLowerCase(Locale.ROOT));
                this.pw.println(line.toUpperCase(Locale.ROOT));
                long endTime = System.nanoTime();

                System.out.println(endTime - startTime);
            }
            this.pw.close();
            this.br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
