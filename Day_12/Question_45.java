package summer_Assignment_25114FW001.Day_12;

import java.util.*;

// Write a program to Write function for palidrome.

public class Question_45 {
    public static void checkPalidrome(int num, int paliNum, int check) {
        if (check == 0) {
            if (num == paliNum) {
                System.out.println("Given num is palidrome number");
            } else {
                System.out.println("Given number is not palidrome number");
            }
            return;
        }

        checkPalidrome(num, paliNum*10 + check%10, check/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        checkPalidrome(num, 0, num);

        sc.close();
    }   
}