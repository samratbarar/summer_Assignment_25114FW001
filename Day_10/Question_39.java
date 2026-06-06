package summer_Assignment_25114FW001.Day_10;

import java.util.*;

/*
Write a program to Print number pyramid. 
    1 
   121 
  12321 
 1234321 
123454321 
*/

public class Question_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of number pyramid ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            // for spaces 
            for (int j = 1; j <= height-i; j++) {
                System.out.print(" ");
            }

            // numbers of half pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // numbers of second half
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}
