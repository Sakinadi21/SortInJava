package bubble;

public class BubbleSort {

        // Method to perform bubble sort on an array
        public static void bubbleSort(int[] array) {
            int n = array.length;
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false; // Initialize swapped as false for each pass
                for (int j = 0; j < n - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        // Swap array[j] and array[j + 1]
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true; // Set swapped to true since a swap occurred
                    }
                }
                // If no two elements were swapped by inner loop, then the array is sorted
                if (!swapped) break;
            }
        }

        // Method to print the array
        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        // Main method to test the bubble sort
        public static void main(String[] args) {
            int[] array = {64, 34, 25, 12, 22, 11, 90};
            System.out.println("Original array:");
            printArray(array);

            bubbleSort(array);

            System.out.println("Sorted array:");
            printArray(array);
        }
    }


