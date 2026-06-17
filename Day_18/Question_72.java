package summer_Assignment_25114FW001.Day_18;

import java.util.*;

// Write a program to Sort array in descending order

public class Question_72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array ");
        int length = sc.nextInt();

        if (length <= 0) {
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

        // descending order sorting of array with selection sort
        for (int i = 0; i < arr.length-1; i++) {
            int maxIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[maxIdx] < arr[j]) {
                    maxIdx = j;
                }
            }

            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }

        // printing sorted array
        System.out.print("Sorted Array is :  ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}
