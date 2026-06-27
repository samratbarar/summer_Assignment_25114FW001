package summer_Assignment_25114FW001.Day_27;

import java.util.*;

// Write a program to Create student record management system.

class details {
    private String name;
    private char gender;
    private int standard;

    public details(String name, char gender, int standard) {
        this.name = name;
        this.gender = gender;
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getStandard() {
        return standard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Gender: " + gender + ", Class: " + standard;
    }
}

class Records {
    private HashMap<Integer, details> students = new HashMap<>();
    private int rollNum;

    public details getStudentInfo(int rollNum) {
        return students.get(rollNum);
    }

    public int addStudentInfo(details student) {
        rollNum++;
        students.put(this.rollNum, student);
        return rollNum;
    }

    public void getTotalStudentsList() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Map.Entry<Integer, details> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void correction(int rollNum, details student) {
        if (students.containsKey(rollNum)) {
            students.put(rollNum, student);
            System.out.println("Updation is successful");
        } else {
            System.out.println("Roll number not found");
        }
    }

    public void deleteStudent(int rollNum) {
        if (students.remove(rollNum) != null) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Roll number not found.");
        }
    }
}

public class Question_105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Records school = new Records();

        do {
            System.out.println("\nWelcome to student records");
            System.out.println("Enter the option number to perform respective task");
            System.out.println("1 -> Add new student information");
            System.out.println("2 -> Get information of a student");
            System.out.println("3 -> Get list of all students");
            System.out.println("4 -> Correct information of a student");
            System.out.println("5 -> Delete student information");

            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println("Enter the name, gender (M/F), and class of student:");
                    sc.nextLine(); // consume newline
                    String name = sc.nextLine();
                    char gender = sc.next().charAt(0);
                    int standard = sc.nextInt();
                    details student = new details(name, gender, standard);
                    System.out.println("The Roll number of new student is " + school.addStudentInfo(student));
                }

                case 2 -> {
                    System.out.println("Enter the roll number of student:");
                    int roll = sc.nextInt();
                    details info = school.getStudentInfo(roll);
                    if (info != null) {
                        System.out.println("Student Info -> " + info);
                    } else {
                        System.out.println("Roll number not found!");
                    }
                }

                case 3 -> school.getTotalStudentsList();

                case 4 -> {
                    System.out.println("Enter the roll number:");
                    int rollNum = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.println("Enter the name, gender (M/F), and class of student:");
                    String name = sc.nextLine();
                    char gender = sc.next().charAt(0);
                    int standard = sc.nextInt();
                    details student = new details(name, gender, standard);
                    school.correction(rollNum, student);
                }

                case 5 -> {
                    System.out.println("Enter roll number to delete:");
                    school.deleteStudent(sc.nextInt());
                }

                default -> System.out.println("Invalid option");
            }

            System.out.println("Enter 1 to continue, 0 to exit:");
        } while (sc.nextInt() == 1);

        sc.close();
    }
}
