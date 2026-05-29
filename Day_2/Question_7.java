package summer_Assignment_25114FW001.Day_2;

import java.util.*;

// Write a program to Find product of digits. 

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        int product = 1;

        while (num > 0) {
            product *= num%10;
            num /= 10;
        }
         
        System.out.println("The product of digits of given number is " + product);
    }
}
