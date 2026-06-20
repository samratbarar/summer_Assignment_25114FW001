package summer_Assignment_25114FW001.Day_6;

import java.util.*;

// Write a program to Convert decimal to binary. 

public class Question_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number ");
        int deciNum = sc.nextInt(), binNum = 0, base = 1;

        while (deciNum > 0) {
            binNum += (deciNum%2) * base;
            base *= 10;
            deciNum /= 2; 
        }

        System.out.println("Conversion of given decimal number into binary is " + binNum);

        sc.close();
    }
}