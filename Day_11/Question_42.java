package summer_Assignment_25114FW001.Day_11;

import java.util.Scanner;

// Write a program to Write function to find maximum.

public class Question_42 {
    public static int max(int ...arr) {
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(m < arr[i]) {
                m = arr[i];
            }
        }

        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of inputs");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter all numbers ");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("The maximum number is " + max(arr));
    }
}
