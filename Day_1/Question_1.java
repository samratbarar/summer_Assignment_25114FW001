package summer_Assignment_25114FW001.Day_1;
import java.util.*;

// Write a program to Calculate sum of first N natural numbers

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // first way is to use loop
        System.out.println("Enter the value of N ");
        int N = sc.nextInt();

        int sum = 1;

        for(int i = 2; i <= N; i++) {
            sum += i;
        }

        System.out.println("The sum of first N natural number is " + sum);

        // second way is to use direct formula 
        System.out.println("Enter the value of N1 ");
        int N1 = sc.nextInt();

        System.out.println("The sum of first N1 natual number is " + (N1*(N1+1))/2);
        
        // The value of N1 is integer so if even is given then it completely divided by 2
        // if given number is odd then N1 + 1 term will be even which further divided by 2
    }
}
