package summer_Assignment_25114FW001.Day_9;

import java.util.*;

/*
Write a program to Print repeated character 
pattern. 
A 
BB 
CCC 
DDDD 
EEEEE 
*/

public class Question_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of half pyramid with repeated character ");
        int height = sc.nextInt();

        char letter = 'A';

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(letter);
            }

            letter++;
            
            System.out.println();
        }
    }
}
