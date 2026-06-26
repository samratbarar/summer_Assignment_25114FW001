package summer_Assignment_25114FW001.Day_26;

import java.util.*;

// Write a program to Create number guessing game.

class Game {
    private int ranNum;
    private int userNum;
    private int noOfGuesses;

    public Game() {
        Random ran = new Random();
        ranNum = ran.nextInt(101);
    }

    public void takeUserInput(int userInput) {
        userNum = userInput;
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
}

public class Question_101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game GuessTheNumber = new Game();

        do {
            System.out.println("Guess the number between 0 to 100");
            GuessTheNumber.takeUserInput(sc.nextInt());
            GuessTheNumber.guessTheNumber();
            GuessTheNumber.incrementNoOfGuesses();
        } while (!GuessTheNumber.isCorrectNumber());

        System.out.println("The number of guesses is " + GuessTheNumber.getNoOfGuesses());

        sc.close();
    }
}