package summer_Assignment_25114FW001.Day_17;

import java.util.*;

// Write a program to Merge arrays.

public class Question_65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array 1 and array 2");
        int length1 = sc.nextInt(), length2 = sc.nextInt();

        if (length1 < 1 || length2 < 1) {
            System.out.println("Please Enter positive length");
            sc.close();
            return;
        }

        int[] merged = new int[length1+length2];

        // inputing array
        System.out.println("Enter integer element of array 1 ");
        for (int i = 0; i < length1; i++) {
            merged[i] = sc.nextInt();
        }

        // merging arrays
        for (int i = length1; i < merged.length; i++) {
            merged[i] = sc.nextInt();
        }

        // printing output
        System.out.println("Elements of merged array : ");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }

        sc.close();
    }
}