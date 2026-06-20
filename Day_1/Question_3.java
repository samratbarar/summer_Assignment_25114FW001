package summer_Assignment_25114FW001.Day_1;
import java.util.*;

// Write a program to Find factorial of a number. 

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();

        int fact = 1;

        for(int i = 2; i <= num; i++) {
            fact *= i;
        }
         
        System.out.println("The Factorial of " + num + " is " + fact);

        sc.close();
    }   
}
