package summer_Assignment_25114FW001.Day_26;

import java.util.*;

// Write a program to Create voting eligibility system.

class Voter {
    private int age;
    public Voter(int age) {
        this.age = age;
    }

    public boolean isEligible() {
        return (age >= 18);
    }
}

public class Question_102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        Voter voter = new Voter(sc.nextInt());
        
        if (voter.isEligible()) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }

        sc.close();
    }
}
