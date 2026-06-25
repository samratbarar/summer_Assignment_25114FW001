package summer_Assignment_25114FW001.Day_25;

import java.util.*;

// Write a program to Merge two sorted arrays. 

public class Question_97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of first sorted array");
        int[] arr1 = new int[sc.nextInt()];

        System.out.println("Enter the length of second sorted array");
        int[] arr2 = new int[sc.nextInt()];

        if (arr1.length == 0 && arr2.length == 0) {
            System.out.println("Both arrays are empty");
            sc.close();
            return;
        }

        System.out.println("Enter the elememts of first array");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elememts of second array");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int idx1 = 0, idx2 = 0, idxMerge = 0;
        int[] merged = new int[arr1.length + arr2.length];
        
        while (idx1 < arr1.length && idx2 < arr2.length) {
            if (arr1[idx1] <= arr2[idx2]) {
                merged[idxMerge++] = arr1[idx1++];
            } else {
                merged[idxMerge++] = arr2[idx2++];
            }
        }

        while (idx1 < arr1.length) {
            merged[idxMerge++] = arr1[idx1++];
        }

        while (idx2 < arr2.length) {
            merged[idxMerge++] = arr2[idx2++];
        }
            
        System.out.println("Merged array elements are");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }

        sc.close();
    }
}