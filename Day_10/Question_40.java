package summer_Assignment_25114FW001.Day_10;

import java.util.*;

/*
Write a program to Print character pyramid.
    A 
   ABA 
  ABCBA 
 ABCDCBA 
ABCDEDCBA 
*/

public class Question_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of character pyramid ");
        int height = sc.nextInt();

        char letter;


        for (int i = 1; i <= height; i++) {
            // for spaces 
            for (int j = 1; j <= height-i; j++) {
                System.out.print(" ");
            }

            letter = 'A';

            // numbers of half pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print(letter++);
            }

            letter--;
            
            // numbers of second half
            for (int j = i-1; j >= 1; j--) {
                System.out.print(--letter);
            }
            
            System.out.println();
        }

        sc.close();
    }
}
