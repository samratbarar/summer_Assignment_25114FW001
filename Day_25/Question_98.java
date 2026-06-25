package summer_Assignment_25114FW001.Day_25;

import java.util.*;

// Write a program to Find common characters in strings. 

public class Question_98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string");
        String str1 = sc.nextLine().toLowerCase();

        System.out.println("Enter the second string");
        String str2 = sc.nextLine().toLowerCase();

        if (str1.isEmpty() && str2.isEmpty()) {
            System.out.println("Both Strings are empty");
            sc.close();
            return;
        }

        boolean[] letters1 = new boolean[26];
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
                letters1[str1.charAt(i) - 'a'] = true;
            }
        }

        boolean[] letters2 = new boolean[26];
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z') {
                letters2[str2.charAt(i) - 'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (letters1[i] && letters2[i]) {
                System.out.print((char)(i + 'a') + " ");
            }
        }

        sc.close();
    }
}