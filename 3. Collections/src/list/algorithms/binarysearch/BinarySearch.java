package list.algorithms.binarysearch;

import java.util.*;

public class BinarySearch {
    public static void binarySearch() {

        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeList = new LinkedList<>();

        while (true) {

            System.out.println("(1) add the property\n(2) Search the property\n(3) Remove the property\n(4) Full list of property");

            //
            String choice = scanner.next();
            switch (choice) {
                case "1": {
                    System.out.println("Enter the Id , Name , Salary:");
                    employeeList.add(new Employee(scanner.nextInt(), scanner.next(), scanner.nextInt()));
                    break;
                }
                case "2": {
                    // sort the ListDemo (ASC order) using by Id
                    Collections.sort(employeeList, Comparator.naturalOrder());

                    System.out.print("Enter the Id: ");
                    int index = Collections.binarySearch(employeeList, new Employee(scanner.nextInt()));

                    if (index >= 0) {
                        System.out.println("Your Value is founded " + index + " no index.");
                        System.out.println(employeeList.get(index) + "\n");
                    } else {
                        System.out.println("Your Value is not Founded!!\n");
                    }
                    break;
                }

                case "3": {
                    // sort the ListDemo (ASC order) using by Id
                    Collections.sort(employeeList, Comparator.naturalOrder());

                    System.out.print("Enter the Id: ");
                    int index = Collections.binarySearch(employeeList, new Employee(scanner.nextInt()));

                    if (index >= 0) {
                        System.out.println("Your Value is founded " + index + " no index.");
                        employeeList.remove(index);
                        System.out.println("Remove the property successFully!!\n");
                    } else {
                        System.out.println("Your Value is not Founded!!\n");
                    }
                    break;
                }


                case "4": {
                    System.out.println(employeeList);
                    break;
                }
                default:
                    System.out.println("Wrong choice!!\n");
            }
        }
    }
}