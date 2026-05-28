package summer_Assignment_25114FW001.Day_1;

import java.util.*;

// Write a program to Print multiplication table of a given number

public class Qustion_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d \n",num,i,num*i);
        }
    }   
}
