package summer_Assignment_25114FW001.Day_8;

import java.util.*;

/*
Write a program to Print character triangle. 
A 
AB 
ABC 
ABCD 
ABCDE 
*/

public class Question_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of half pyramid with character ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            char letter = 'A';

            for (int j = 1; j <= i; j++) {
                System.out.print(letter);
                letter++;
            }

            System.out.println();
        }

        sc.close();
    }
}
