package summer_Assignment_25114FW001.Day_5;

import java.util.*;

// Write a program to Print factors of a number. 

public class Question_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Given number is zero which have infinte fractors");
            sc.close();
            return;
        } else {
            if (num < 0) {
                num = -1 * num;
            } 
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.print(i + "," + -1*i + ",");
                }
            }

            System.out.print(num + "," + -1*num);

            sc.close();
        }
    }
}
