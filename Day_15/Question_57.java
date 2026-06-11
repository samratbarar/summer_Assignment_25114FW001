package summer_Assignment_25114FW001.Day_15;

import java .util.*;

// Write a program to Reverse array. 

public class Question_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array ");
        int length = sc.nextInt();

        int[] arr = new int[length];

        // inputing array
        System.out.println("Enter integer element of array");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // reversing
        for (int i = 0; i < length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[length-1-i];
            arr[length-1-i] = temp;
        }

        // printing
        System.out.println("Reversed Array : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}