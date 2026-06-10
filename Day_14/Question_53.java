package summer_Assignment_25114FW001.Day_14;

import java.util.*;

// Write a program to Linear search. 

public class Question_53 {
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

        System.out.println("Enter the key element ");
        int key = sc.nextInt();

        for (int i = 0; i < length; i++) {
            if (arr[i] == key) {
                System.out.println("Index of key element is " + i);
                sc.close();
                return;
            }
        }

        System.out.println("Given key element is not present on array");

        sc.close();
    }
}
