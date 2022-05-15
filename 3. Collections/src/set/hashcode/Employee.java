package set.hashcode;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int empId;
    private String name;
    private int age;
    private int salary;

    public Employee(int empId, String name, int age, int salary) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        String display = String.format("\nId: %d , Name: %s , Age: %d , Salary: %d\n",
                getEmpId(),getName(),getAge(),getSalary());
        return display;
    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // equals() and hashCode() are tightly bound to each other
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId &&
                age == employee.age &&
                salary == employee.salary &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name, age, salary);
    }

    @Override
    public int compareTo(Employee emp) {
        if (this.getName().compareToIgnoreCase(emp.getName()) > 0)
            return 1;
        else if (this.getName().compareToIgnoreCase(emp.getName()) < 0)
            return -1;
        return 0;
    }
}
