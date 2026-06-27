package summer_Assignment_25114FW001.Day_27;

import java.util.*;

class SalaryDetails {
    private String name;
    private double basicSalary;
    private double allowances;
    private double deductions;

    public SalaryDetails(String name, double basicSalary, double allowances, double deductions) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
        this.deductions = deductions;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getAllowances() {
        return allowances;
    }

    public double getDeductions() {
        return deductions;
    }

    public double getNetSalary() {
        return basicSalary + allowances - deductions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    @Override
    public String toString() {
        return "Name: " + name +
               ", Basic Salary: " + basicSalary +
               ", Allowances: " + allowances +
               ", Deductions: " + deductions +
               ", Net Salary: " + getNetSalary();
    }
}

class SalaryRecords {
    private HashMap<Integer, SalaryDetails> employees = new HashMap<>();
    private int ID;

    public SalaryDetails getEmployeeInfo(int ID) {
        return employees.get(ID);
    }

    public int addEmployeeInfo(SalaryDetails employee) {
        ID++;
        employees.put(this.ID, employee);
        return ID;
    }

    public void getTotalEmployeesList() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        
        for (Map.Entry<Integer, SalaryDetails> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void correction(int ID, SalaryDetails employee) {
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

    public void searchByName(String name) {
        boolean found = false;
        for (Map.Entry<Integer, SalaryDetails> entry : employees.entrySet()) {
            if (entry.getValue().getName().equalsIgnoreCase(name)) {
                System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
                found = true;
            }
        }

        if (!found) System.out.println("No employee found with name " + name);
    }
}

public class Question_107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalaryRecords company = new SalaryRecords();

        do {
            System.out.println("\nWelcome to Salary Management System");
            System.out.println("1 -> Add new employee salary info");
            System.out.println("2 -> Get salary info of an employee");
            System.out.println("3 -> List all employees");
            System.out.println("4 -> Correct salary info of an employee");
            System.out.println("5 -> Delete employee");
            System.out.println("6 -> Search employee by name");

            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println("Enter name, basic salary, allowances, deductions:");
                    sc.nextLine(); // consume newline
                    String name = sc.nextLine();
                    double basic = sc.nextDouble();
                    double allowances = sc.nextDouble();
                    double deductions = sc.nextDouble();
                    SalaryDetails employee = new SalaryDetails(name, basic, allowances, deductions);
                    System.out.println("Employee ID: " + company.addEmployeeInfo(employee));
                }

                case 2 -> {
                    System.out.println("Enter employee ID:");
                    int id = sc.nextInt();
                    SalaryDetails info = company.getEmployeeInfo(id);
                    System.out.println(info != null ? info : "ID not found!");
                }

                case 3 -> company.getTotalEmployeesList();

                case 4 -> {
                    System.out.println("Enter employee ID:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter name, basic salary, allowances, deductions:");
                    String name = sc.nextLine();
                    double basic = sc.nextDouble();
                    double allowances = sc.nextDouble();
                    double deductions = sc.nextDouble();
                    company.correction(id, new SalaryDetails(name, basic, allowances, deductions));
                }

                case 5 -> {
                    System.out.println("Enter employee ID to delete:");
                    company.deleteEmployee(sc.nextInt());
                }

                case 6 -> {
                    System.out.println("Enter name to search:");
                    sc.nextLine();
                    company.searchByName(sc.nextLine());
                }

                default -> System.out.println("Invalid option");
            }

            System.out.println("Enter 1 to continue, 0 to exit:");
        } while (sc.nextInt() == 1);

        sc.close();
    }
}
