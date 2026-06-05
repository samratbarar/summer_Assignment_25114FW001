package summer_Assignment_25114FW001.Day_9;

import java.util.*;

/*
Write a program to Print reverse number 
triangle. 
 
12345 
1234 
123 
12 
1 
*/

public class Question_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of inverted half pyramid with number ");
        int height = sc.nextInt();

        for (int i = height; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
