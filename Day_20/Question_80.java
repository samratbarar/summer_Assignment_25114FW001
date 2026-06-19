package summer_Assignment_25114FW001.Day_20;

import java.util.*;

// Write a program to Find column-wise sum.

public class Question_80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix ");
        int rows = sc.nextInt(), cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Please Enter correct values");
            sc.close();
            return;
        }

        int[][] mat = new int[rows][cols];

        // inputing matrix
        System.out.println("Enter integer element of matrix ");
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter " + (i+1) + " row of matrix ");
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // finding column wise sum
        for (int i = 0; i < cols; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum += mat[j][i];
            }
            System.out.println("Column " + (i+1) + " Sum is " + sum);
        }

        sc.close();
    }
}