package summer_Assignment_25114FW001.Day_15;

import java.util.*;

// Write a program to Rotate array left.

public class Question_58 {
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
            System.out.println("It is single element array cannot rotate ");
            sc.close();
            return;
        }
        
        // rotating
        int firstEle = arr[0];
        for (int i = 0; i < length-1; i++) {
            arr[i] = arr[i+1];
        }

        arr[length-1] = firstEle;

        // printing
        System.out.println("Array after left rotation : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
