package summer_Assignment_25114FW001.Day_6;

import java.util.*;

// Write a program to Count set bits in a number. 
// count of set bits in a number means how many 1s in its binary representation

public class Question_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number ");
        int deciNum = sc.nextInt(), count = 0, bitNum = deciNum;

        while (deciNum > 0) {
            if (deciNum%2 == 1){
                count++;
            }
            deciNum /= 2;
        }

        System.out.println("The number of set bits in given number is " + count);

        // bitwise approach 
        count = 0;
        while (bitNum > 0) {
            if ((bitNum & 1) == 1) {
                count++;
            }

            bitNum = bitNum >> 1;
        }

        System.out.println("The number of set bits in given number is " + count);

        sc.close();
    }
}
