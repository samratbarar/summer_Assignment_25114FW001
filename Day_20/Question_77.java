package summer_Assignment_25114FW001.Day_20;

import java.util.*;

// Write a program to Multiply matrices. 

public class Question_77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix 1 ");
        int row1 = sc.nextInt(), col1 = sc.nextInt();

        System.out.println("Enter the number of rows and columns of matrix 2 ");
        int row2 = sc.nextInt(), col2 = sc.nextInt();

        if (row1 <= 0 || col1 <= 0 || row2 <= 0 || col2 <= 0 || col1 != row2) {
            System.out.println("Please Enter correct values");
            sc.close();
            return;
        }

        int[][] mat1 = new int[row1][col1];
        int[][] mat2 = new int[row2][col2];
        int[][] multi = new int[row1][col2];

        // inputing array 1
        System.out.println("Enter integer element of marix 1 ");
        for (int i = 0; i < row1; i++) {
            System.out.println("Enter " + (i+1) + " row of matrix 1 ");
            for (int j = 0; j < col1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        // inputing second array 
        System.out.println("Enter integer element of marix 2 ");
        for (int i = 0; i < row2; i++) {
            System.out.println("Enter " + (i+1) + " row of matrix 2 ");
            for (int j = 0; j < col2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        // multiply
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {
                    multi[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        // displaying multiplication matrix
        System.out.println("Product matrix is ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}