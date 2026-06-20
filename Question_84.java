package summer_Assignment_25114FW001;

import java.util.*;

// Write a program to Convert lowercase to uppercase. 

public class Question_84 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string");
    String str = sc.nextLine();

    // System.out.println(str.toUpperCase());

    char[] strLC = new char[str.length()];

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
            strLC[i] = (char)(str.charAt(i) - 32);       
        } else {
            strLC[i] = str.charAt(i);
        }
    }

    str = new String(strLC);

    System.out.println("Upper case String is " + str);

    sc.close();
   } 
}
