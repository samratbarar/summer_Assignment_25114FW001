package summer_Assignment_25114FW001.Day_26;

import java.util.*;

// Write a program to Create quiz application.

class Quiz {
    private Scanner sc;
    private final int[] answers = { 1, 2, 3, 4, 1, 2, 3, 4, 1, 3 };
    private int score;
    private final int CORRECT_SCORE = +4;
    private final int SKIP_SCORE = -1;
    private final int WRONG_SCORE = -2;

    public Quiz(Scanner sc) {
        this.score = 0;
        this.sc = sc;
    }

    public void intro() {
        System.out.println(
                "Welcome to Quiz master\nThere is 10 question in the quiz\nEach correct answer increased your score by 4 and wrong reduce your score by 2\nSo answer option number between 1 to 4 and if you want to leave question enter 0 but your score will be decreased by 1");
    }

    public void startQuiz() {
        for (int i = 0; i < answers.length; i++) {
            System.out.println("Question " + (i+1) + " .... Answer it");
            int option = sc.nextInt();

            if (option < 0 || option > 4) {
                System.out.println("Enter option between 0 and 4");
                i--;
                continue;
            }

            if (option == answers[i]) {
                this.score += CORRECT_SCORE;
            } else if (option == 0) {
                this.score += SKIP_SCORE;
            } else {
                this.score += WRONG_SCORE;
            }
        }

        System.out.println("Your score is " + this.score);
    }
}

public class Question_104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Quiz quiz = new Quiz(sc);
        quiz.intro();
        quiz.startQuiz();

        sc.close();
    }
}
