package summer_Assignment_25114FW001.Day_3;

import java.util.*;

// Write a program to Check whether a number is prime

public class Question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        int count = 0;

        for(int i = 2; i <= num/2; i++) {
            if(num%i == 0) {
                count++;
                break;
            }
        }
        
        if (count == 1 || num == 0 || num == 1) {
            System.out.println("Entered number is not prime");
        }else {
            System.out.println("Entered number is prime");
        }

        sc.close();
    }
}