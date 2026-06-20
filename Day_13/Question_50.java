package summer_Assignment_25114FW001.Day_13;

import java.util.*;

// Write a program to Find sum and average of array.

public class Question_50 {
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

        // finding sum
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }

        // finding average
        float avg = (float)sum / length;

        System.out.println("Sum and average of array are " + sum + " and " + avg);   

        sc.close();
    }
}