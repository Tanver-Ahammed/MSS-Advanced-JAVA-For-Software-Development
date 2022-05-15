package basic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fileName;
        while(true) {
            System.out.print("Enter file Name: ");
            fileName = input.nextLine();

            ByteStream fileEncryption = new ByteStream(fileName);
            fileEncryption.start();
        }
    }
}