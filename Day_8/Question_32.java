package summer_Assignment_25114FW001.Day_8;

import java.util.*;

/*
Write a program to Print repeated-number 
pattern. 
1 
22 
333 
4444 
55555
*/

public class Question_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of half pyramid with repeated number ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }

        sc.close();
    }
}
