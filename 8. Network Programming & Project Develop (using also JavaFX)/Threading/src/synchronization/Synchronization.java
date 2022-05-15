package synchronization;

public class Synchronization {
    public static void main(String[] args) {

        Printer printer1 = new Printer();

        Person tanver = new Person("Tanver", printer1, 5);

        Person sheuly = new Person("Sheuly", printer1, 10);

        Person tariq = new Person("Tariq", printer1, 8);

        Person bonna = new Person("Bonna", printer1, 3);
    }
}
