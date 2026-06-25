package summer_Assignment_25114FW001.Day_25;

import java.util.*;

// Write a program to Sort names alphabetically. 

public class Question_99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of names");
        String[] names = new String[sc.nextInt()];
        sc.nextLine();

        System.out.println("Enter the list of names");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        sc.close();
    }
}
