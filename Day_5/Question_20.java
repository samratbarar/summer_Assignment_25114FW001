package summer_Assignment_25114FW001.Day_5;

import java.util.*;

// Write a program to Find largest prime factor. 

public class Question_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt(), count = -1;

        if (num <= 1) {
            System.out.println("Given number has no prime factors");
            return;
        }

        for (int i = num/2; i > 1; i--) {
            if (num % i == 0) {
                count = 0;

                for (int j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
            }

            if (count == 0) {
                System.out.println("The largest prime factor of given number is " + i);
                break;
            }
        }

        if (count == -1) {
            System.out.println("The largest prime factor of given number is " + num);
        }
    }
}
