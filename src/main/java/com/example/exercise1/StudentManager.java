package com.example.exercise1;
import java.util.Scanner;

public class StudentManager {

        private String[] students;
        private int studentCount;

        public StudentManager(int capacity) {
            students = new String[capacity];
            studentCount = 0;
        }

        public boolean addStudent(String name) {
            if (studentCount == students.length) {
                System.out.println("Array overflow: Cannot add more students.");
                return false;
            }
            students[studentCount++] = name;
            return true;
        }

        public boolean searchStudent(String name) {
            for (String student: students) {
                if(student.equalsIgnoreCase(name)) {
                    return true;
                }
            }
            return false;
        }

        public boolean deleteStudent(String name) {
            for (int i = 0; i < studentCount; i++) {
                if (students[i].equalsIgnoreCase(name)) {
                    for(int j = i; j<students.length-1; j++) {
                        students[j] = students[j+1];
                    }
                    studentCount--;
                    return true;
                }
            }
            return false;
        }

        public void displayStudents() {
            if (studentCount == 0) {
                System.out.println("No students to display.");
                return;
            }
            for (int i = 0; i < studentCount; i++) {
                System.out.println((i + 1) + ". " + students[i]);
            }
        }
}