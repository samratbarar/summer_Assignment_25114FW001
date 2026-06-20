package summer_Assignment_25114FW001.Day_8;

import java.util.Scanner;

/*
Write a program to Print number triangle. 
1 
12 
123 
1234 
12345 
*/

public class Question_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of half pyramid with number ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}
