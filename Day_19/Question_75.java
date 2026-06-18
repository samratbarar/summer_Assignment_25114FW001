package summer_Assignment_25114FW001.Day_19;

import java.util.*;

// Write a program to Transpose matrix.

public class Question_75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix ");
        int row = sc.nextInt(), col = sc.nextInt();

        if (row <= 0 || col <= 0) {
            System.out.println("Please Enter positive values");
            sc.close();
            return;
        }

        int[][] mat = new int[row][col];

        // inputing array
        System.out.println("Enter integer element of marix ");
        for (int i = 0; i < row; i++) {
            System.out.println("Enter " + (i + 1) + " row of matrix 1 ");
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // displaying transpose matrix
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}