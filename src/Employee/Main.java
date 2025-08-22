package Employee;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[100];

        int count = 0;

        while (true) {
            System.out.println(" !! --- Employee Management System --- !!");
            System.out.println("1. Add Manager");
            System.out.println("2. Add Developer");
            System.out.println("3. List Employees");
            System.out.println("4. Find Employee with Highest Salary");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // create manager
                    System.out.println("Enter name: ");
                    String mName = scanner.nextLine();
                    System.out.println("Enter department: ");
                    String mDepartment = scanner.nextLine();
                    System.out.println("Enter salary: ");
                    double mSalary = scanner.nextDouble();
                    System.out.println("Enter bonus: ");
                    double mBonus = scanner.nextDouble();
                    employees[count++] = new Manager(mName, mDepartment, mSalary, mBonus);
                    break;
                case 2:
                    // create dev
                    System.out.println("Enter name: ");
                    String dName = scanner.nextLine();
                    System.out.println("Enter department: ");
                    String dDepartment = scanner.nextLine();
                    System.out.println("Enter salary: ");
                    double dSalary = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter language: ");
                    String dLang = scanner.nextLine();
                    employees[count++] = new Developer(dName, dDepartment, dSalary, dLang);
                    break;
                case 3:
                    // print employees
                    System.out.println("--- Employee List ---");
                    for (int i = 0; i < count; i++) {
                        employees[i].displayInfo();
                        System.out.println();
                    }
                    break;
                case 4:
                    // find employee with the highest salary
                    if (count == 0) {
                        System.out.println("No employees added yet.");
                        break;
                    }
                    Employee highest = employees[0];
                    for (int i = 0; i <count; i++) {
                        if (employees[i].getSalary() > highest.getSalary()) {
                            highest = employees[i];
                        }
                    }
                    System.out.println("--- Employee with the Highest Salary");
                    highest.displayInfo();
                    break;
                case 5:
                    System.out.println("Exiting...Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

    }
}