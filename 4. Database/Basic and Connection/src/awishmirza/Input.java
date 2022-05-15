package awishmirza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    public static String getInput(String value) {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(value);
        System.out.flush();

        try {
            return buffer.readLine();
        } catch (IOException e) {
            return "ERROR!!";
        }
    }

    public static Integer getInt(String value) throws NumberFormatException {
        String input = getInput(value);
        return Integer.parseInt(input);
    }
}






















