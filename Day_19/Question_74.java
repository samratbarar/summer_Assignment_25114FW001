package summer_Assignment_25114FW001.Day_19;

import java.util.*;

// Write a program to Subtract matrices.

public class Question_74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrices ");
        int row = sc.nextInt(), col = sc.nextInt();

        if (row <= 0 || col <= 0) {
            System.out.println("Please Enter positive values");
            sc.close();
            return;
        }

        int[][] mat = new int[row][col];

        // inputing array
        System.out.println("Enter integer element of matrix 1 ");
        for (int i = 0; i < row; i++) {
            System.out.println("Enter " + (i + 1) + " row of matrix 1 ");
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // inputing second array and finding difference
        System.out.println("Enter integer element of matrix 2 ");
        for (int i = 0; i < row; i++) {
            System.out.println("Enter " + (i + 1) + " row of matrix 2 ");
            for (int j = 0; j < col; j++) {
                mat[i][j] -= sc.nextInt();
            }
        }

        // displaying diference matrix
        System.out.println("Difference matrix is ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
