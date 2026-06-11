package summer_Assignment_25114FW001.Day_15;

import java.util.Scanner;

// Write a program to Rotate array right. 

public class Question_59 {
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

        if (length == 1) {
            System.out.println("It is single element array cannot rotate ");
            sc.close();
            return;
        }
        
        // rotating
        int lastEle = arr[length-1];
        for (int i = length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = lastEle;

        // printing
        System.out.println("Array after right rotation : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}