package summer_Assignment_25114FW001.Day_29;

import java.util.*;

// Write a program to Create menu-driven calculator.

class InvalidInputException extends Exception {
    @Override
    public String getMessage() {
        return "Please enter correct input";
    }
}

class CannotDivideBy0Exception extends Exception {
    @Override
    public String getMessage() {
        return "Cannot divide by zero";
    }
}

class MaxInputException extends Exception {
    @Override
    public String getMessage() {
        return "Input value is greater than 100000";

    }
}

class MaxMultiplierInputException extends Exception {
    @Override
    public String getMessage() {
        return "Multiplication input is greater than 7000";
    }
}

class Calculator {
    private double operand1;
    private double operand2;
    private String operator;
    private final int MAX_INPUT = 100000;
    private final int MAX_MULTIPLY = 7000;

    public Calculator(String operator, double operand1, double operand2) throws InvalidInputException, MaxInputException, MaxMultiplierInputException {
        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            throw new InvalidInputException();
        }

        if (operand1 > MAX_INPUT || operand2 > MAX_INPUT) {
            throw new MaxInputException();
        }

        if (operator.equals("*") && (operand1 > MAX_MULTIPLY || operand2 > MAX_MULTIPLY)) {
            throw new MaxMultiplierInputException();
        }

        if ((operand1 == 8 && operand2 == 9) || (operand1 == 9 && operand2 == 8)) {
            throw new InvalidInputException();
        }

        this.operator = operator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double calculate() throws CannotDivideBy0Exception {
        switch (operator) {
            case "+":
                return operand1 + operand2;

            case "-":
                return operand1 - operand2;

            case "*":
                return operand1 * operand2;

            case "/":
                if (operand2 == 0) {
                    throw new CannotDivideBy0Exception();
                }

                return operand1 / operand2;

            default:
                return 0; 
        }
    }
}

public class Question_113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
                sc.close();
                return;
            }

            String operator;
            switch (choice) {
                case 1:
                    operator = "+";
                    break;

                case 2:
                    operator = "-";
                    break;

                case 3:
                    operator = "*";
                    break;
                    
                case 4:
                    operator = "/";
                    break;

                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            try {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                Calculator calculator = new Calculator(operator, num1, num2);
                System.out.println("Result: " + calculator.calculate());
            } catch (InvalidInputException | MaxInputException | MaxMultiplierInputException
                    | CannotDivideBy0Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}