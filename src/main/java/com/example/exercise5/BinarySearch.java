package com.example.exercise5;

import java.util.Arrays;

public class BinarySearch {

    // Method to perform binary search
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (array[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            } else { // If target is smaller, ignore the right half
                right = mid - 1;
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = binarySearch(array, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
