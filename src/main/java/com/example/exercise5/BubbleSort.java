package com.example.exercise5;

public class BubbleSort {

        // Method to perform bubble sort
        public static void bubbleSort(int[] array) {
            int n = array.length;
            boolean swapped;

            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        // Swap array[j] and array[j + 1]
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }
                // If no elements were swapped, the array is already sorted
                if (!swapped) break;
            }
        }

        public static void main(String[] args) {
            int[] array = {64, 25, 12, 22, 11};

            System.out.println("Unsorted array:");
            for (int num : array) {
                System.out.print(num + " ");
            }

            bubbleSort(array);

            System.out.println("\nSorted array:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
}
