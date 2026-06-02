package summer_Assignment_25114FW001.Day_6;

import java.util.*;

// Write a program to Find x^n without pow().

public class Question_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number(x) and value of power(n) to which number is raised");
        int x = sc.nextInt(), n = sc.nextInt();
        double power = 1;

        if (x == 0 && n == 0) {
            System.out.println("x^n = not definite");
            return;
        } else if (x == 0) {
            System.out.println("x^n = 0");
            return;
        } else if (n == 0) {
            System.out.println("x^n = 1");
            return;
        } else if (n > 0) {
            for (int i = 1; i <= n; i++) {
                power *= x;
            }
        } else if (n < 0) {
            for (int i = 1; i <= -n; i++) {
                power *= 1.0/x;
            }
        }

        System.out.println("x^n = " + power);
    }
}