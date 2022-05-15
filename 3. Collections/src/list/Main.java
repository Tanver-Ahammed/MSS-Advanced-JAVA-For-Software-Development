package list;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        Student student1 = new Student(19016,"Tanver",80);
        Student student2 = new Student(19017,"Sheuly",70);
        Student student3 = new Student(19018,"Tariq",60);
        Student student4 = new Student(19019,"Bonna",50);
        Student student5 = new Student(19020,"Utsha",40);

        list.add(student3);
        list.add(student4);
        list.add(student1);
        list.add(student5);
        list.add(student2);

        System.out.println(list);

        System.out.println(list.contains(student2));
        System.out.println(list.indexOf(student2));

        Collections.sort(list,Comparator.naturalOrder());

        System.out.println(list);

        System.out.println(list.contains(new Student(19016,"Tanver",80)));
        System.out.println(list.indexOf(new Student(19016,"Tanver",80)));
    }
}

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int salary;

    @Override
    public String toString() {
        String display = String.format("\nId: %d , Name: %s , Salary: %d\n",getId(),getName(),getSalary());
        return display;
    }

    public Student(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Student student) {
        if (this.getName().compareToIgnoreCase(student.getName()) > 0) {
            return 1;
        } else if (this.getName().compareToIgnoreCase(student.getName()) < 0) {
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id &&
                salary == student.salary &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
}