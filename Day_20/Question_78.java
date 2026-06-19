package summer_Assignment_25114FW001.Day_20;

import java.util.*;

// Write a program to Check symmetric matrix. 

public class Question_78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimension of square matrix ");
        int dim = sc.nextInt();

        if (dim <= 0) {
            System.out.println("Please Enter correct values");
            sc.close();
            return;
        }

        int[][] mat = new int[dim][dim];

        // inputing array 1
        System.out.println("Enter integer element of matrix ");
        for (int i = 0; i < dim; i++) {
            System.out.println("Enter " + (i+1) + " row of matrix ");
            for (int j = 0; j < dim; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // checking the symmetric of matrix
        for (int i = 0; i < dim; i++) {
            for (int j = i+1; j < dim; j++) {
                if (mat[i][j] != mat[j][i]) {
                    System.out.println("This matrix is not symmetric ");
                    sc.close();
                    return;
                }
            }
        }

        System.out.println("This matrix is symmetric");

        sc.close();
    }
}