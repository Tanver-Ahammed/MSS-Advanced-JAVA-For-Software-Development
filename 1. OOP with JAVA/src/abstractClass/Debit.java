package abstractClass;

public abstract class Debit extends Account {
    @Override
    public String getType() {
        return "This is Debit Account.";
    }
}
