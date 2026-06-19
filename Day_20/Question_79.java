package summer_Assignment_25114FW001.Day_20;

import java.util.*;

// Write a program to Find row-wise sum. 

public class Question_79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix ");
        int row = sc.nextInt(), col = sc.nextInt();

        if (row <= 0 || col <= 0) {
            System.out.println("Please Enter correct values");
            sc.close();
            return;
        }

        int[][] mat = new int[row][col];

        // inputing array 1
        System.out.println("Enter integer element of matrix ");
        for (int i = 0; i < row; i++) {
            System.out.println("Enter " + (i+1) + " row of matrix ");
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // finding row wise sum
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += mat[i][j];
            }
            System.out.println("Row " + (i+1) + " Sum is " + sum);
        }

        sc.close();
    }
}