// package Java.JavaPractice;

/*
 * Java * New Feature
 * 
 * 1] Lambda function
 * 2] Stream API
 * 3] Functional Interface 
 * 4] Date and Time API
 * 5] 
 * 
 * 
 */

@FunctionalInterface
interface Employee {
    String getEmployeeName();

}

interface EmployeeJobRole {
    int EmployeeSalary();
}

// class EmployeeDB implements Employee {

// public String getEmployeeName() {
// return "Harry Potter";
// }

// }

public class NewJavaFeature {
    public static void main(String[] args) {

        // lambda expression implementation for SAM (Functional Interface)

        Employee emp = () -> "Harry Potter";

        System.out.println(emp.getEmployeeName());

    }

}
