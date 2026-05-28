package summer_Assignment_25114FW001.Day_1;
import java.util.*;

// Write a program to Count digits in a number.

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        int count = 0;

        while(num > 0) {
            num /= 10;
            count++;
        }

        System.out.println("The number of digits present in given number is " + count);
    }  
}
