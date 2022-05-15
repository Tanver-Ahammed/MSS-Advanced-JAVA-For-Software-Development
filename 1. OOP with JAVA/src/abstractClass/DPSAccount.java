package abstractClass;

public class DPSAccount extends Account {
    @Override
    public String getType() {
        return "This is DPS Account.";
    }

    @Override
    public void describe() {
        System.out.println(this.getType());
    }
}
