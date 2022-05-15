package list.algorithms.binarysearch;

public class Employee implements Comparable<Employee> {
    private int empId;
    private String empName;
    private int empSalary;

    // constructor for set value for add the ListDemo
    public Employee(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    // constructor for the search from the ListDemo
    public Employee(int empId) {
        this.empId = empId;
    }

    // getters and setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    // Override the toString for print the proper Employee property
    @Override
    public String toString() {
        String display = String.format("Id: %d , Name: %s , Salary: %d\n",getEmpId(),getEmpName(),getEmpSalary());
        return display;
    }

    // CompareTo method for sort the employee (by Id)
    @Override
    public int compareTo(Employee employee) {
        if (this.getEmpId() > employee.getEmpId()) {
            return 1;
        } else if (this.getEmpId() < employee.getEmpId()) {
            return -1;
        }
        return 0;
    }
}
