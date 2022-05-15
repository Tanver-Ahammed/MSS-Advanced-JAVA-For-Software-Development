import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        while (true) {
            System.out.print("Enter File Name: ");
            fileName = scanner.nextLine();

            Encryption fileEncryption = new Encryption(fileName);
            fileEncryption.start();

        }
    }
}
