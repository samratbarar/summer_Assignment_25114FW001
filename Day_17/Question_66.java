package summer_Assignment_25114FW001.Day_17;

import java.util.*;

// Write a program to Union of arrays. 

public class Question_66 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> union = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array 1 and array 2");
        int length1 = sc.nextInt(), length2 = sc.nextInt();

        if (length1 < 1 || length2 < 1) {
            System.out.println("Please Enter positive length");
            sc.close();
            return;
        }

        // inputing arrays and finding unions
        System.out.println("Enter integer element of array 1 ");
        for (int i = 0; i < length1; i++) {
            union.add(sc.nextInt());
        }

        System.out.println("Enter integer element of array 2 ");
        for (int i = 0; i < length2; i++) {
            union.add(sc.nextInt());
        }

        System.out.println("Union elements are : ");
        for (Integer ele : union) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}