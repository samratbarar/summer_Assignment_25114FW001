package summer_Assignment_25114FW001.Day_27;

import java.util.*;

// Write a program to Create marksheet generation system.

class studentDetails {
    private int rollNum;
    private String name;
    private char gender;
    private int standard;

    public studentDetails(String name, char gender, int rollNum, int standard) {
        this.name = name;
        this.gender = gender;
        this.rollNum = rollNum;
        this.standard = standard;
    }

    public int getRollNum() {
        return rollNum;
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

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
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
        return "Name: " + name + ", Roll Number: " + rollNum + ", Gender: " + gender + ", Class: " + standard;
    }
}

class Marksheet {
    Scanner sc;
    private int numOfSubjects;
    private String[] subjects;
    private int[] marks;
    private int[] maxMarks;
    private studentDetails student;

    public Marksheet(int numOfSubjects, Scanner sc) {
        this.numOfSubjects = numOfSubjects;
        this.sc = sc;
        subjects = new String[numOfSubjects];
        marks = new int[numOfSubjects];
        maxMarks = new int[numOfSubjects];
    }

    public void resultEntry() {
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.println("Enter subject " + (i + 1) + " name:");
            sc.nextLine(); // consume newline
            subjects[i] = sc.nextLine();
            System.out.println("Enter marks obtained and maximum marks:");
            marks[i] = sc.nextInt();
            maxMarks[i] = sc.nextInt();
            if (marks[i] > maxMarks[i]) {
                System.out.println("Enter valid marks ");
                i--;
                continue;
            }
        }
    }

    public void studentEntry() {
        System.out.println("Enter your name, gender(M/F), roll number and class");
        sc.nextLine();
        String name = sc.nextLine();
        char gender = sc.next().charAt(0);
        int rollNum = sc.nextInt();
        int standard = sc.nextInt();
        student = new studentDetails(name, gender, rollNum, standard);
    }

    public String marksheet() {
        StringBuilder result = new StringBuilder(student.toString() + "\n");
        int sumMarks = 0, sumMaxMarks = 0;

        for (int i = 0; i < numOfSubjects; i++) {
            String status = (marks[i] >= 0.33 * maxMarks[i]) ? "Pass" : "Fail";
            result.append((i + 1) + " -> " + subjects[i] +
                    " | Marks Obtained: " + marks[i] +
                    " | Max Marks: " + maxMarks[i] +
                    " | Status: " + status + "\n");
            sumMarks += marks[i];
            sumMaxMarks += maxMarks[i];
        }

        double percentage = (sumMarks * 100.0) / sumMaxMarks;
        result.append("\nTotal Marks Obtained: " + sumMarks +
                "\nPercentage: " + String.format("%.2f", percentage) + "%");

        // Overall grade
        if (percentage >= 90)
            result.append("\nGrade: A+");
        else if (percentage >= 75)
            result.append("\nGrade: A");
        else if (percentage >= 60)
            result.append("\nGrade: B");
        else if (percentage >= 40)
            result.append("\nGrade: C");
        else
            result.append("\nGrade: Fail");

        return result.toString();
    }
}

public class Question_108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of subjects ");
        Marksheet marksheet = new Marksheet(sc.nextInt(), sc);
        marksheet.studentEntry();
        marksheet.resultEntry();
        System.out.println(marksheet.marksheet());

        sc.close();
    }
}
