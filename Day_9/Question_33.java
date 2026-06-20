package summer_Assignment_25114FW001.Day_9;

import java.util.*;

/*
Write a program to Print reverse star pattern. 
***** 
**** 
*** 
** 
* 
*/

public class Question_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of inverted half pyramid ");
        int height = sc.nextInt();

        for (int i = height; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
