package summer_Assignment_25114FW001.Day_25;

import java.util.*;

// Write a program to Sort words by length. 

public class Question_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of words ");
        String[] words = new String[sc.nextInt()];

        for (int i = 0; i < words.length; i++) {
            words[i] = sc.next();
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp; 
                }
            }
        }

        System.out.println(Arrays.toString(words));

        sc.close();
    }
}
