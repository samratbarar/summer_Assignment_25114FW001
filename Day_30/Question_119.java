package summer_Assignment_25114FW001.Day_30;

import java.util.*;

// Write a program to Create mini employee management system. 

class Details {
    private String name;
    private char gender;
    private int branchCode;

    public Details(String name, char gender, int branchCode) {
        this.name = name;
        this.gender = gender;
        this.branchCode = branchCode;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Gender: " + gender + ", Branch Code: " + branchCode;
    }
}

class Records {
    private HashMap<Integer, Details> employees = new HashMap<>();
    private int ID = 1000;

    public Details getEmployeeInfo(int ID) {
        return employees.get(ID);
    }

    public int addEmployeeInfo(Details employee) {
        ID++;
        employees.put(ID, employee);
        return ID;
    }

    public void getTotalEmployeesList() {
        if (employees.isEmpty()) {
            System.out.println("No Employees found.");
            return;
        }

        for (Map.Entry<Integer, Details> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void correction(int ID, Details employee) {
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

public class Question_119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Records company = new Records();

        while (true) {
            System.out.println("\nWelcome to company records");
            System.out.println("1 Add employee");
            System.out.println("2 Get employee");
            System.out.println("3 List employees");
            System.out.println("4 Update employee");
            System.out.println("5 Delete employee");
            System.out.println("6 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.println("Enter name, gender (M/F), branch code:");
                    String name = sc.nextLine();
                    char gender = sc.next().charAt(0);
                    int branchCode = sc.nextInt();
                    sc.nextLine();

                    Details employee = new Details(name, gender, branchCode);
                    System.out.println("Employee ID: " + company.addEmployeeInfo(employee));
                }

                case 2 -> {
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    Details info = company.getEmployeeInfo(id);
                    System.out.println(info != null ? info : "ID not found");
                }

                case 3 -> company.getTotalEmployeesList();

                case 4 -> {
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter name, gender, branch code:");
                    String name = sc.nextLine();
                    char gender = sc.next().charAt(0);
                    int branchCode = sc.nextInt();
                    sc.nextLine();

                    Details employee = new Details(name, gender, branchCode);
                    company.correction(id, employee);
                }

                case 5 -> {
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    company.deleteEmployee(id);
                }

                case 6 -> {
                    System.out.println("GoodBye");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid option");
            }
        }
    }
}