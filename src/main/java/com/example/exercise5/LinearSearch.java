package com.example.exercise5;

public class LinearSearch {

    // Method to perform linear search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index of the found element
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = linearSearch(array, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
