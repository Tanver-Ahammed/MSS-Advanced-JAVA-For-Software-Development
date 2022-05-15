package synchronization;

public class Person implements Runnable {

    String name;
    final Printer printer;
    int pages;
    Thread thread;

    public Person(String name, Printer printer, int pages) {
        this.name = name;
        this.printer = printer;
        this.pages = pages;
        this.thread = new Thread(this, name);
        this.thread.start();
    }

    @Override
    public void run() {

//        synchronized (printer) {
        this.printer.printAssignment(this);
//        }
    }
}