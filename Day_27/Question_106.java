package summer_Assignment_25114FW001.Day_27;

import java.util.*;

// Write a program to Create employee management system. 

class details {
    private String name;
    private char gender;
    private int branchCode;

    public details(String name, char gender, int branchCode) {
        this.name = name;
        this.gender = gender;
        this.branchCode = branchCode;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getBranchCode() {
        return branchCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Gender: " + gender + ", Branch Code: " + branchCode;
    }
}

class Records {
    private HashMap<Integer, details> employees = new HashMap<>();
    private int ID;

    public details getEmployeeInfo(int ID) {
        return employees.get(ID);
    }

    public int addEmployeeInfo(details employee) {
        ID++;
        employees.put(this.ID, employee);
        return ID;
    }

    public void getTotalEmployeesList() {
        if (employees.isEmpty()) {
            System.out.println("No Employees found.");
            return;
        }
        for (Map.Entry<Integer, details> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void correction(int ID, details employee) {
        if (employees.containsKey(ID)) {
            employees.put(ID, employee);
            System.out.println("Updation is successful");
        } else {
            System.out.println("ID not found");
        }
    }

    public void deleteEmployee(int ID) {
        if (employees.remove(ID) != null) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("ID not found.");
        }
    }
}

public class Question_106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Records company = new Records();

        do {
            System.out.println("\nWelcome to company records");
            System.out.println("Enter the option number to perform respective task");
            System.out.println("1 -> Add new employee information");
            System.out.println("2 -> Get information of an employee");
            System.out.println("3 -> Get list of all employees");
            System.out.println("4 -> Correct information of an employee");
            System.out.println("5 -> Delete an employee");

            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println("Enter the name, gender (M/F), and branch code of employee:");
                    sc.nextLine(); // consume newline
                    String name = sc.nextLine();
                    char gender = sc.next().charAt(0);
                    int branchCode = sc.nextInt();
                    details employee = new details(name, gender, branchCode);
                    System.out.println("The ID of new employee is " + company.addEmployeeInfo(employee));
                }

                case 2 -> {
                    System.out.println("Enter the ID of employee:");
                    int roll = sc.nextInt();
                    details info = company.getEmployeeInfo(roll);
                    if (info != null) {
                        System.out.println("Employee Info -> " + info);
                    } else {
                        System.out.println("ID not found!");
                    }
                }

                case 3 -> company.getTotalEmployeesList();

                case 4 -> {
                    System.out.println("Enter the ID:");
                    int ID = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.println("Enter the name, gender (M/F), and branch code of employee:");
                    String name = sc.nextLine();
                    char gender = sc.next().charAt(0);
                    int branchCode = sc.nextInt();
                    details employee = new details(name, gender, branchCode);
                    company.correction(ID, employee);
                }

                case 5 -> {
                    System.out.println("Enter the ID:");
                    int id = sc.nextInt();
                    company.deleteEmployee(id);
                }

                default -> System.out.println("Invalid option");
            }

            System.out.println("Enter 1 to continue, 0 to exit:");
        } while (sc.nextInt() == 1);

        sc.close();
    }
}
