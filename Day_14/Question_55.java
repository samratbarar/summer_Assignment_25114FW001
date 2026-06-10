package summer_Assignment_25114FW001.Day_14;

import java.util.*;

// Write a program to Second largest element. 

public class Question_55 {
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

        int largest = arr[0], secLargest = Integer.MIN_VALUE;

        for (int i = 0; i < length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        boolean found = false;

        for (int i = 0; i < length; i++) {
            if (arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];
                found = true;
            }
        }

        if (found) {
            System.out.println("The second largest element is " + secLargest);
        } else {
            System.out.println("There is no second largest in this array");
        }

        sc.close();
    }
}
