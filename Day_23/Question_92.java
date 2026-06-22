package summer_Assignment_25114FW001.Day_23;

import java.util.*;

// Write a program to Find maximum occurring character

public class Question_92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string");
        String str = sc.nextLine().trim();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            }
        }

        int max = 0;
        char maxChar = ' ';
        for (int i = 0; i <= str.length()/2; i++) {
            if (max < map.get(str.charAt(i))) {
                max = map.get(str.charAt(i));
                maxChar = str.charAt(i);               
            }

            if (max < map.get(str.charAt(str.length()-1-i))) {
                max = map.get(str.charAt(str.length()-1-i));
                maxChar = str.charAt(str.length()-1-i);               
            }
        }
        
        System.out.println("The maximum occurring character is " + maxChar);

        sc.close();
    }
}