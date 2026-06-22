package summer_Assignment_25114FW001.Day_23;

import java.util.*;

// Write a program to Check anagram strings.

public class Question_91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string");
        String str1 = sc.nextLine().trim().toLowerCase();
        System.out.println("Enter the second string");
        String str2 = sc.nextLine().trim().toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("These string are not anagram strings");
            sc.close();
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != ' ') {
                if (!map.containsKey(str2.charAt(i))) {
                    System.out.println("These strings are not anagram strings");
                    sc.close();
                    return;
                }

                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);

                if (map.get(str2.charAt(i)) == 0) {
                    map.remove(str2.charAt(i));
                }
            }
        }

        if (map.isEmpty()) {
            System.out.println("These strings are anagram strings");
        } else {
            System.out.println("These strings are not anagram strings");
        }
 
        sc.close();
    }
}
