package summer_Assignment_25114FW001.Day_16;

import java.util.*;

// Write a program to Remove duplicates from array.

public class Question_64 {
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

        int[] uniqueArr = new int[length];
        int count = 0;
        for (int i = 0; i < length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            } 

            if (found) {
                continue;
            }

            uniqueArr[count++] = arr[i];
        }

        for (int i = 0; i < length; i++) {
            if (count > i) {
                arr[i] = uniqueArr[i];
                System.out.print(arr[i] + " ");
            } else {
                arr[i] = 0;
            }
        }

        sc.close();
    }
}