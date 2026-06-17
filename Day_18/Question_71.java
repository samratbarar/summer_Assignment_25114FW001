package summer_Assignment_25114FW001.Day_18;

import java.util.*;

// Write a program to Binary search.

public class Question_71 {
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

        // sorting the array with selection sort
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

        // binary search
        System.out.println("Enter the element which have to search ");
        int key = sc.nextInt();
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end-start)/2; 

            if (arr[mid] == key) {
                System.out.println("Index of key is " + mid);
                sc.close();
                return;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            }

            if (arr[mid] > key) {
                end = mid - 1;
            }
        }

        System.out.println("Key is not found in array ");

        sc.close();
    }
}