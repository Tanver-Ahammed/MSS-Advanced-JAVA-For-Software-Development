package set.hashcode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetHashCode {

    public void execute() {

        HashSet<Employee> hashSet = new HashSet<>();
        LinkedHashSet<Employee> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Employee> treeSet = new TreeSet<>();

        Employee emp1 = new Employee(101,"Tanver",20,80000);
        Employee emp2 = new Employee(102,"Sheuly",25,20000);
        Employee emp3 = new Employee(103,"Tariq",22,60000);
        Employee emp4 = new Employee(104,"Bonna",24,2000);
        Employee emp = new Employee(104,"Bonna",23,50000);
        Employee emp5 = new Employee(105,"Utsha",13,70000);

        //---------------------------HashSet------------------------------------
        hashSet.add(emp1);
        hashSet.add(emp2);
        hashSet.add(emp3);
        hashSet.add(emp4);
        hashSet.add(emp5);
        hashSet.add(emp);

        System.out.println("HashSet:");
        System.out.println(hashSet);

        Employee searchEmp =  new Employee(104,"Bonna",23,50000);

        System.out.println("Student found: " + hashSet.contains(searchEmp));


        //---------------------------LinkedHashSet------------------------------------
        System.out.println("\nLinkedHashSet:");

        linkedHashSet.add(emp1);
        linkedHashSet.add(emp2);
        linkedHashSet.add(emp3);
        linkedHashSet.add(emp4);
        linkedHashSet.add(emp);
        linkedHashSet.add(emp5);

        System.out.println(linkedHashSet);

        Employee searchEmp1 =  new Employee(104,"Bonna",23,50000);

        System.out.println("Student found: " + hashSet.contains(searchEmp1));

        //---------------------------TreeSet------------------------------------
        System.out.println("\nTreeSet:");

        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);
        treeSet.add(emp4);
        treeSet.add(emp);
        treeSet.add(emp5);

        System.out.println(treeSet);

        Employee searchEmp2 =  new Employee(104,"Bonna",23,50000);

        System.out.println("Student found: " + hashSet.contains(searchEmp2));
    }
}
