package summer_Assignment_25114FW001.Day_14;

import java.util.*;

// Write a program to Frequency of an element.

public class Question_54 {
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
        int key = sc.nextInt(), count =0;

        for (int i = 0; i < length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        
        System.out.println("Frequeny of key element is " + count);
        

        sc.close();
    }
}
