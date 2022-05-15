package genericInterfaceInPractice;

public class Manager extends Employee implements TeamLeader{
    @Override
    public void massage() {
        System.out.println("Calling all the Specialist for te meeting.");
    }
}
