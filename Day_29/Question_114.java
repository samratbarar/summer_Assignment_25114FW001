package summer_Assignment_25114FW001.Day_29;

import java.util.*;

// Write a program to Create menu-driven array operations system.

class ArrayOperations {
    private int[] arr;
    private int size;

    public ArrayOperations(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void insert(int value) {
        if (size == arr.length) {
            System.out.println("Array is full");
            return;
        }

        arr[size] = value;
        size++;
        System.out.println("Element inserted successfully");
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
        System.out.println("Element deleted successfully");
    }

    public void update(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        arr[index] = value;
        System.out.println("Element updated successfully");
    }

    public void search(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                System.out.println("Element found at index " + i);
                return;
            }
        }

        System.out.println("Element not found");
    }

    public void display() {
        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }

        System.out.println("--- Array Elements ---");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public void findMax() {
        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }

        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }

    public void findMin() {
        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }

        int min = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
    }
}

public class Question_114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int capacity = sc.nextInt();

        ArrayOperations ao = new ArrayOperations(capacity);

        while (true) {

            System.out.println("\n--- Array Operations Menu ---");

            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Update Element");
            System.out.println("4. Search Element");
            System.out.println("5. Display Array");
            System.out.println("6. Find Maximum");
            System.out.println("7. Find Minimum");
            System.out.println("8. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter value: ");
                    ao.insert(sc.nextInt());
                }
                case 2 -> {
                    System.out.print("Enter index: ");
                    ao.delete(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();

                    System.out.print("Enter new value: ");
                    int value = sc.nextInt();

                    ao.update(index, value);
                }
                case 4 -> {
                    System.out.print("Enter value to search: ");
                    ao.search(sc.nextInt());
                }
                case 5 -> {
                    ao.display();
                }
                case 6 -> {
                    ao.findMax();
                }
                case 7 -> {
                    ao.findMin();
                }
                case 8 -> {
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}