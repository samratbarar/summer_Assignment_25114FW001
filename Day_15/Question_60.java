package summer_Assignment_25114FW001.Day_15;

import java.util.Scanner;

// Write a program to Move zeroes to end. 

public class Question_60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array ");
        int length = sc.nextInt();

        if (length < 1) {
            System.out.println("Please Enter positive length");
            sc.close();
            return;
        }

        int[] arr = new int[length];

        // inputing array
        System.out.println("Enter integer element of array");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        if (length == 1) {
            System.out.println("Single element array, no shifting required");
            sc.close();
            return;
        }

        // shifting all zero at end
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < length) {
            arr[count++] = 0;
        }

        // printing
        System.out.println("Array after shifting all zero's at end : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}