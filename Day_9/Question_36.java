package summer_Assignment_25114FW001.Day_9;

import java.util.*;

/*
Write a program to Print hollow square 
pattern. 
***** 
*   * 
*   * 
*   * 
***** 
*/

public class Question_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of hollow square pattern");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if ((i == 1) || (i == height) || (j == 1) || (j == height)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}
