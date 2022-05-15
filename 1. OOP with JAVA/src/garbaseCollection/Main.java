package garbaseCollection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            for (int i = 0; i < 100; i++) {
                String token = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
                list.add(token + token + token + token + token + token + token + token);
            }
            // do some operation with this 100 elements Arraylist, like insert into BD
            // we intend to call clear method. But forget it.....

            list.clear();
        }
    }
}
