package summer_Assignment_25114FW001.Day_17;

import java.util.*;

// Write a program to Intersection of arrays. 

public class Question_67 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        LinkedHashSet<Integer> intersection = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array 1 and array 2");
        int length1 = sc.nextInt(), length2 = sc.nextInt();

        if (length1 < 1 || length2 < 1) {
            System.out.println("Please Enter positive length");
            sc.close();
            return;
        }

        // inputing array
        System.out.println("Enter integer element of array 1 ");
        for (int i = 0; i < length1; i++) {
            set1.add(sc.nextInt());
        }

        // inputing second array and finding intersection
        System.out.println("Enter integer element of array 2 ");
        for (int i = 0; i < length2; i++) {
            int input = sc.nextInt();
            if (set1.contains(input)) {
                intersection.add(input);
            }
        }

        // displaying elements
        System.out.println("The intersection elements are ");
        for (Integer ele : intersection) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}