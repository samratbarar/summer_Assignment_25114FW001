package summer_Assignment_25114FW001.Day_14;

import java.util.*;

// Write a program to Find duplicates in array. 

public class Question_56 {
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

        int[] duliArr = new int[length];
        int count = 0;

        for (int i = 0; i < length; i++) {
            boolean found = false;
            for (int k = 0; k < count; k++) {
                if (arr[i] == duliArr[k]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    duliArr[count++] = arr[i];
                    break;
                }
            }
        }

        if (count == 0) {
            System.out.println("No Duplicates found");
            sc.close();
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(duliArr[i] + " ");
        }

        sc.close();
    }
}