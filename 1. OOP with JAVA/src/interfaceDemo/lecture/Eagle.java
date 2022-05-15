package interfaceDemo.lecture;

public class Eagle implements Flyable,Lively {

    @Override
    public void fly() {
        System.out.println("The Eagle flying very fast.....");
    }

    @Override
    public String getName() {
        return "White Eagle";
    }

    @Override
    public int livingYears() {
        return 80*365;
    }
}
