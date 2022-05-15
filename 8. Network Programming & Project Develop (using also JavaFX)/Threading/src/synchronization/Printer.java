package synchronization;

public class Printer {

    synchronized public void printAssignment(Person person) {
        System.out.println(person.name + "--> Printing started ...");
        for (int i = 0; i < person.pages; i++) {
            System.out.println(person.name + "--> printed page#" + (i + 1));
        }
        System.out.println(person.name + "-->Competed.....");
    }
}