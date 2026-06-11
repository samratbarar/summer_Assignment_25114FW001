package summer_Assignment_25114FW001.Day_16;

import java.util.*;

// Write a program to Find pair with given sum.

public class Question_63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array ");
        int length = sc.nextInt();

        if (length < 1) {
            System.out.println("Please Enter positive length");
            sc.close();
            return;
        }

        if (length < 2) {
            System.out.println("Invalid length");
            sc.close();
            return;
        }

        int[] arr = new int[length];

        // inputing array
        System.out.println("Enter integer element of array");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < length; i++) {
            int firstNum = arr[i];
            for (int j = i+1; j < length; j++) {
                int secondNum = arr[j];
                if (firstNum+secondNum == target) {
                    System.out.println("Pair is " + firstNum + " and " + secondNum);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("There is no pair ");
        }

        sc.close();
    }
}