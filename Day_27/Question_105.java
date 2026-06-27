package summer_Assignment_25114FW001.Day_27;

import java.util.*;

// Write a program to Create student record management system.

class Records {
    private HashMap<Integer, String> students = new HashMap<>();
    private int rollNum;

    public String getStudentInfo(int rollNum) {
        return students.get(rollNum);
    }

    public int addStudentInfo(String name) {
        rollNum++;
        students.put(this.rollNum, name);

        return rollNum;
    }

    public void getTotalStudentsList() {
        System.out.println(students);
    }

    public void correctionInName(int rollNum, String name) {
        if (students.containsKey(rollNum)) {
           students.put(rollNum, name);
           System.out.println("Updation is successfull"); 
        } else {
            System.out.println("Roll number is not found");
        } 
    }
}

public class Question_105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Records school = new Records();

        do {
            System.out.println("Welcome to student records\nEnter the option number to perform respective task");
            System.out.println("1 -> To add new student infomation\n2 -> To get information of a student\n3 -> To get list of all students\n4 -> To correct information of student");

            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println("Enter the name of student");
                    System.out.println("The Roll number of new student is " + school.addStudentInfo(sc.nextLine()));
                }

                case 2 -> System.out.println("Enter the roll number of student " + school.getStudentInfo(sc.nextInt()));

                case 3 -> school.getTotalStudentsList();

                case 4 -> {
                    System.out.println("Enter the roll number and correction in name");
                    int rollNum = sc.nextInt();
                    sc.nextLine();
                    String name = sc.nextLine();
                    school.correctionInName(rollNum, name);
                }

                default -> System.out.println("Invalid option");
            }

            System.out.println("If you want to continue Enter 1 else 0 to exit");
        } while (sc.nextInt() == 1);

        sc.close();
    }
}