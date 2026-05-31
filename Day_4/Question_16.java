package summer_Assignment_25114FW001.Day_4;

import java.util.*;

// Write a program to Print Armstrong numbers in a range.

public class Question_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range of the armstrong numbers ");
        int range = sc.nextInt();

        for (int i = 1; i <= range; i++) {
            int noOfDigit = 0, sum = 0, checker = i;

            while (checker > 0) {
                noOfDigit++;
                checker /= 10;
            }

            checker = i;

            while (checker > 0) {
                sum += Math.pow(checker % 10, noOfDigit);
                checker /= 10;
            }

            if (i == sum) {
                System.out.print(i + " ");
            }
        }
    }
}