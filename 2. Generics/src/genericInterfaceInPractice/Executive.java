package genericInterfaceInPractice;

public class Executive extends Employee implements TeamLeader{
    @Override
    public void massage() {
        System.out.println("Calling all the Operator for te meeting.");
    }
}
