package summer_Assignment_25114FW001.Day_13;

import java.util.*;

// Write a program to Count even and odd elements.

public class Question_52 {
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

        // Counting even and odd numbers
        int countEven = 0, countOdd = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i]%2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("The number of even numbers in array is " + countEven);
        System.out.println("The number of odd numbers in array is " + countOdd);

        sc.close();
    }
}