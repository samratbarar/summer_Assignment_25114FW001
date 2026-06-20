package summer_Assignment_25114FW001.Day_11;

import java.util.*;

// Write a program to Write function to check prime.

public class Question_43 {
    public static void primeNUMChecker(int n) {
        if (n == 0 || n == 1 || n < 0) {
            System.out.println("Given number is not prime");
            return;
        }

        for (int i = 2; i*i <= n; i++) {
            if (n%i == 0) {
                System.out.println("Given number is not prime");
                return;
            }
        }

        System.out.println("The given is prime");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        primeNUMChecker(sc.nextInt());

        sc.close();
    }
}
