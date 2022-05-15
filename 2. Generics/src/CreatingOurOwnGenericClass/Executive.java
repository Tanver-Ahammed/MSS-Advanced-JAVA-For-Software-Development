package CreatingOurOwnGenericClass;

public class Executive extends Employee implements TeamLeader {
    @Override
    public void callForMeeting() {
        System.out.println("Sending notification to team members for meeting....");
    }
}
