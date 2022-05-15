package genericInterfaceInPractice;

import java.util.LinkedList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        Team<Manager,Specialist>team1 = new InternalTeam(new Manager(),new LinkedList<Specialist>());
        team1.getLeader();

        InternalTeam anotherInternalTeam  = new InternalTeam(new Manager(),new LinkedList<Specialist>());
        anotherInternalTeam.uniqueMethodForInternalTeam();

        Team<Manager,Specialist> externalTeam = new ExternalTeam<>(new Manager(),new LinkedList<Specialist>());
        externalTeam.getMembers();

        Team<Executive,Operator> externalTeam1 = new ExternalTeam<>(new Executive(),new LinkedList<Operator>());
        externalTeam1.getMembers();

        ExternalTeam<Executive,Operator,PartTimer>anotherExternalTeam = new ExternalTeam(new Executive(),new LinkedList(),new LinkedList<>());
        anotherExternalTeam.getExternals();





















    }
}
