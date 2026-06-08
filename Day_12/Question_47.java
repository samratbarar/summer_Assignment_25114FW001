package summer_Assignment_25114FW001.Day_12;

import java.util.*;

// Write a program to Write function for 
// Fibonacci.

public class Question_47 {
    public static void printFibo(int t1, int t2, int n) {
        if (n <= 0) {
            System.out.println("Number of terms must be positive");
            return;
        }

        for (int i = 0; i < n; i++) {
            int next = t1 + t2;
            System.out.print(t1);
            if (i < n-1) {
                System.out.print(", ");
            }
            t1 = t2;
            t2 = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first and second term of series and no of terms");
        printFibo(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
}
