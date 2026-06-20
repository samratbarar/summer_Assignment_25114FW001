package summer_Assignment_25114FW001.Day_6;

import java.util.Scanner;

// Write a program to Convert binary to decimal. 

public class Question_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary number ");
        int binNum = sc.nextInt(), deciNum = 0, base = 1;

        while (binNum > 0) {
            deciNum += (binNum%10) * base;
            base *= 2;
            binNum /= 10;
        }

        System.out.println("Conversion of given binary number into decimal is " + deciNum);

        sc.close();
    }
}