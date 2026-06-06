package summer_Assignment_25114FW001.Day_10;

import java.util.*;

/*
Write a program to Print star pyramid. 
    * 
   *** 
  ***** 
 ******* 
********* 
*/

public class Question_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of star pyramid ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            // for spaces 
            for (int j = 1; j <= height-i; j++) {
                System.out.print(" ");
            }

            // star printing using 2*i - 1
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
