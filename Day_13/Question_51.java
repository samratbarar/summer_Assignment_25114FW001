package summer_Assignment_25114FW001.Day_13;

import java.util.*;

// Write a program to Find largest and smallest element

public class Question_51 {
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

        // Finding Largest and Smallest element
        int largest = arr[0], smallest = arr[0];
        
        for (int i = 1; i < length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];               
            }
            if (arr[i] > largest) {
                largest = arr[i];                
            }
        }

        System.out.println("The largest and smallest elements are " + largest + " and " + smallest);
    }
}
