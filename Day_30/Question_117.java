package summer_Assignment_25114FW001.Day_30;

import java.util.*;

// Write a program to Create student record system using arrays and strings.

// Student class
class Details {
    private String name;
    private char gender;
    private int standard;

    public Details(String name, char gender, int standard) {
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

// Records system using ARRAY
class Records {
    private Details[] students;
    private int size;
    private int rollNum;

    public Records(int capacity) {
        students = new Details[capacity];
        size = 0;
        rollNum = 1000;
    }

    public int addStudentInfo(Details student) {
        if (size == students.length) {
            System.out.println("Array is full! Cannot add more students.");
            return -1;
        }

        students[size] = student;
        size++;
        rollNum++;
        return rollNum;
    }

    public Details getStudentInfo(int roll) {
        int index = roll - 1001; // mapping roll to index

        if (index >= 0 && index < size) {
            return students[index];
        }
        return null;
    }

    public void getTotalStudentsList() {
        if (size == 0) {
            System.out.println("No students found.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Roll No: " + (1001 + i) + " -> " + students[i]);
        }
    }

    public void correction(int roll, Details student) {
        int index = roll - 1001;

        if (index >= 0 && index < size) {
            students[index] = student;
            System.out.println("Updation is successful");
        } else {
            System.out.println("Roll number not found");
        }
    }

    public void deleteStudent(int roll) {
        int index = roll - 1001;

        if (index < 0 || index >= size) {
            System.out.println("Roll number not found.");
            return;
        }

        // shift elements left
        for (int i = index; i < size - 1; i++) {
            students[i] = students[i + 1];
        }

        students[size - 1] = null;
        size--;

        System.out.println("Student deleted successfully.");
    }
}

// Main class
public class Question_117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Records school = new Records(100); // capacity fixed

        while (true) {
            System.out.println("\nWelcome to student records");
            System.out.println("1 -> Add new student information");
            System.out.println("2 -> Get information of a student");
            System.out.println("3 -> Get list of all students");
            System.out.println("4 -> Correct information of a student");
            System.out.println("5 -> Delete student information");
            System.out.println("6 -> Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.println("Enter name, gender (M/F), and class:");
                    String name = sc.nextLine();
                    char gender = sc.next().charAt(0);
                    int standard = sc.nextInt();
                    sc.nextLine();

                    Details student = new Details(name, gender, standard);
                    int roll = school.addStudentInfo(student);

                    if (roll != -1) {
                        System.out.println("Roll number assigned: " + roll);
                    }
                }

                case 2 -> {
                    System.out.println("Enter roll number:");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    Details info = school.getStudentInfo(roll);

                    if (info != null) {
                        System.out.println("Student Info -> " + info);
                    } else {
                        System.out.println("Roll number not found!");
                    }
                }

                case 3 -> school.getTotalStudentsList();

                case 4 -> {
                    System.out.println("Enter roll number:");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter new name, gender (M/F), and class:");
                    String name = sc.nextLine();
                    char gender = sc.next().charAt(0);
                    int standard = sc.nextInt();
                    sc.nextLine();

                    Details student = new Details(name, gender, standard);
                    school.correction(roll, student);
                }

                case 5 -> {
                    System.out.println("Enter roll number to delete:");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    school.deleteStudent(roll);
                }

                case 6 -> {
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid option");
            }
        }
    }
}