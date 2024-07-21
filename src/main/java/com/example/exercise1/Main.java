package com.example.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager(5); // Adjust capacity as needed

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to add: ");
                    String nameToAdd = scanner.nextLine();
                    if (manager.addStudent(nameToAdd)) {
                        System.out.println("Student added successfully.");
                    }
                    break;
                case 2:
                    System.out.print("Enter student name to search: ");
                    String nameToSearch = scanner.nextLine();
                    if (manager.searchStudent(nameToSearch)) {
                        System.out.println("Student found.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter student name to delete: ");
                    String nameToDelete = scanner.nextLine();
                    if (manager.deleteStudent(nameToDelete)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    manager.displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
