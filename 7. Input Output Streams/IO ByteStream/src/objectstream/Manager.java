package objectstream;

import java.io.Serializable;

public class Manager implements Serializable {
    public void callForMeeting() {
        System.out.println("sending notification to team members for meeting.");
    }
}
