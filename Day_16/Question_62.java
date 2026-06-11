package summer_Assignment_25114FW001.Day_16;

import java.util.*;

// Write a program to Find maximum frequency element.

public class Question_62 {
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

        int maxFreq = 0;
        int maxFreqEle = arr[0];
        for (int i = 0; i < length; i++) {
            int freq = 1;
            for (int j = 0; j < length; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }

            if (freq > maxFreq) {
                maxFreq = freq;
                maxFreqEle = arr[i];
            }
        }

        if (maxFreq == 1) {
            System.out.println("There is no dulpicate elements ");
        } else {
            System.out.println("The maximum frequency element is " + maxFreqEle);
        }

        sc.close();
    }
}

/*
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
            System.out.println("No repeated element found");
            sc.close();
            return;
        }

        int[] freq = new int[count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < length; j++) {
                if (duliArr[i] == arr[j]) {
                    freq[i] += 1;
                }
            }
        }

        int maxFreq = 0;
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] > freq[maxFreq]) {
                maxFreq = i;
            }
        }

        System.out.println("The maximum frequency element is " + duliArr[maxFreq]);

        sc.close();
*/