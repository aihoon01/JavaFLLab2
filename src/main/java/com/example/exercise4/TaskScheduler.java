package com.example.exercise4;

import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduler {

    private Queue<String> taskQueue;

    public TaskScheduler() {
        taskQueue = new LinkedList<>();
    }

    // Add a task to the queue
    public void addTask(String task) {
        taskQueue.offer(task); // Offer adds the task to the end of the queue
        System.out.println("Task added: " + task);
    }

    // Remove the next task from the queue (mark it as completed)
    public String removeTask() {
        String task = taskQueue.poll(); // Poll removes and returns the task from the front of the queue
        if (task != null) {
            System.out.println("Task completed: " + task);
        } else {
            System.out.println("No tasks to complete.");
        }
        return task;
    }

    // Display the current queue contents
    public void displayTasks() {
        if (taskQueue.isEmpty()) {
            System.out.println("No tasks in the queue.");
        } else {
            System.out.println("Current tasks in the queue:");
            for (String task : taskQueue) {
                System.out.println("- " + task);
            }
        }
    }
}
