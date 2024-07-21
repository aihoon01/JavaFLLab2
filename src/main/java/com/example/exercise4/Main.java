package com.example.exercise4;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Add tasks to the scheduler
        scheduler.addTask("Task 1");
        scheduler.addTask("Task 2");
        scheduler.addTask("Task 3");

        // Display current tasks
        scheduler.displayTasks();

        // Remove tasks from the scheduler
        scheduler.removeTask();
        scheduler.removeTask();

        // Display remaining tasks
        scheduler.displayTasks();

        // Remove remaining tasks
        scheduler.removeTask();
        scheduler.removeTask(); // This should show "No tasks to complete."
    }
}
