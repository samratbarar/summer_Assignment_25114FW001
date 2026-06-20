package summer_Assignment_25114FW001.Day_12;

import java.util.*;

// Write a program to Write function for armstrong

public class Question_46 {
    public static void checkArmstrong(int num) {
        int checker = num, noOfDigit = 0, sum = 0;

        while (num > 0) {
            noOfDigit++;
            num /= 10;
        }

        num = checker;

        while (num > 0) {
            sum += Math.pow(num%10 , noOfDigit);
            num /= 10;
        }

        if (checker == sum) {
            System.out.println("Given number is armstrong number ");
        } else {
            System.out.println("Given number is not armstrong number ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        checkArmstrong(sc.nextInt());

        sc.close();
    }
}
