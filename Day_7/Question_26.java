package summer_Assignment_25114FW001.Day_7;

import java.util.*;

// Write a program to Recursive Fibonacci. 

public class Question_26 {
    public static void fibonacci(int term1, int term2, int range) {
        if (range == 0) {
            return;
        }

        System.out.print("," + (term1+term2));
        fibonacci(term2, term1+term2, range-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the range of fibonacci series and first, second term of it ");
        int range = sc.nextInt(), firstTerm = sc.nextInt(), secondTerm = sc.nextInt();

        if (range > 2){
            System.out.print(firstTerm + "," + secondTerm);
        } else if (range == 2) {
            System.out.print(firstTerm + "," + secondTerm);
            return;
        } else if (range == 1) {
            System.out.print(firstTerm);
            return;
        } else {
            System.out.println("Invalid range");
            return;
        }

        fibonacci(firstTerm, secondTerm, range-2);
    }
}
