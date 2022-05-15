package abstractClass;

public class SalaryAccount extends Debit {
    @Override
    public void describe() {
        System.out.println("This salary account description.");
    }
}
