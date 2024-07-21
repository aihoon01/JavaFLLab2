package com.example.exercise2;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addAt(1, 15);

        System.out.println("List after adding elements:");
        list.printList(); // Output: 10 15 20 30

        System.out.println("Size of the list: " + list.size()); // Output: 4

        System.out.println("Contains 20? " + list.contains(20)); // Output: true
        System.out.println("Contains 25? " + list.contains(25)); // Output: false

        list.delete(15);
        System.out.println("List after deleting 15:");
        list.printList(); // Output: 10 20 30

        System.out.println("Size of the list: " + list.size()); // Output: 3
    }
}
