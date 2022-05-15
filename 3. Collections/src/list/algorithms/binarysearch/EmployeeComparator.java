package list.algorithms.binarysearch;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

    // CompareTo method for search the employee (by Id)
    @Override
    public int compare(Employee emp1,Employee emp2) {
        if (emp1.getEmpId() == emp2.getEmpId()) {
            return 0;
        }
        else {
            return -1;
        }
    }

}
