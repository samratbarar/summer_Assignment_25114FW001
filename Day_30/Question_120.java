package summer_Assignment_25114FW001.Day_30;

import java.util.*;

// Write a program to Develop complete mini project using arrays, strings and functions.

class Game {
    private int ranNum;
    private int userNum;
    private int noOfGuesses;
    private int[] guesses = new int[100]; // ARRAY ADDED

    public Game() {
        Random ran = new Random();
        ranNum = ran.nextInt(100) + 1;
    }

    public void takeUserInput(int userInput) {
        userNum = userInput;
        guesses[noOfGuesses] = userInput; // store in array
    }

    public boolean isCorrectNumber() {
        return userNum == ranNum;
    }

    public void incrementNoOfGuesses() {
        noOfGuesses++;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void guessTheNumber() {
        if (userNum > ranNum) {
            System.out.println("Entered number is greater");
        } else if (userNum < ranNum) {
            System.out.println("Entered number is smaller");
        } else {
            System.out.println("Entered number is correct");
        }
    }

    public void showHistory() {
        System.out.println("Your guesses:");
        for (int i = 0; i < noOfGuesses; i++) {
            System.out.print(guesses[i] + " ");
        }
        System.out.println();
    }
}

public class Question_120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Game g = new Game();

        do {
            System.out.println("Guess the number (1 to 100): ");
            g.takeUserInput(sc.nextInt());
            g.guessTheNumber();
            g.incrementNoOfGuesses();
        } while (!g.isCorrectNumber());

        g.showHistory();
        System.out.println("Total guesses: " + g.getNoOfGuesses());

        sc.close();
    }
}