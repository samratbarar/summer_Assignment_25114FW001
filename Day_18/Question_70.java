package summer_Assignment_25114FW001.Day_18;

import java.util.*;

// Write a program to Selection sort. 

public class Question_70 {
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

        // selection sorting
        for (int i = 0; i < arr.length-1; i++) {
            int smallestEleIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallestEleIdx] > arr[j]) {
                    smallestEleIdx = j;
                }
            }

            int temp = arr[smallestEleIdx];
            arr[smallestEleIdx] = arr[i];
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