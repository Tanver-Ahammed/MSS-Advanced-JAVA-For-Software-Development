package interfaceDemo.example;

public class Son implements Father,Mother {

    @Override
    public void height() {
        System.out.println("He is height is same as Father.");
    }

    @Override
    public void eye() {
        System.out.println("He is eye is same as Mother.");
    }

    @Override
    public void address() {
        System.out.println("Now she live in Dhaka.");
    }
}
