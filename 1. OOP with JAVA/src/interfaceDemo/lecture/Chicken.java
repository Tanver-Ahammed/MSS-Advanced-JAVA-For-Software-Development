package interfaceDemo.lecture;

public class Chicken implements Eatable,Flyable {
    @Override
    public String getNutrition() {
        return "Protein";
    }

    @Override
    public void fly() {
        System.out.println("Chicken fly rarely when only necessary.");
    }

    @Override
    public String getName() {
        return "Desi Chicken";
    }

    @Override
    public int getPrice() {
        return 350;
    }
}
