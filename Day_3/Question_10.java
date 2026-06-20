package summer_Assignment_25114FW001.Day_3;

import java.util.*;

// Write a program to Print prime numbers in a range

public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of ineteger upto which prime numbers shoukd be printed ");
        int range = sc.nextInt();

        // as 0 and 1 is not primee hence we can exclude them
        for (int i = 2; i <= range; i++) {

            int count = 0;

            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
