package quick;

public class QuickSortFirstPivot {

        // Function to perform QuickSort on an array
        public static void quickSort(int[] array, int low, int high) {
            if (low < high) {
                // Find the partition index
                int pi = partition(array, low, high);

                // Recursively sort the elements before and after partition
                quickSort(array, low, pi - 1);
                quickSort(array, pi + 1, high);
            }
        }


        // Function to partition the array and return the pivot index
        public static int partition(int[] array, int low, int high) {
            int pivot = array[low]; // Choose the leftmost element as pivot
            int i = low + 1; // Index for traversing the array from the left
            int j = high; // Index for traversing the array from the right

            while (i <= j) {
                // Find an element larger than the pivot from the left
                while (i <= j && array[i] <= pivot) {
                    i++;
                }
                // Find an element smaller than the pivot from the right
                while (i <= j && array[j] > pivot) {
                    j--;
                }
                // Swap elements at i and j
                if (i < j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            // Swap the pivot element with the element at index j
            array[low] = array[j];
            array[j] = pivot;

            return j; // Return the partition index
        }

        // Function to print the array
        public static void printArray(int[] array) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Main method to test the QuickSort
        public static void main(String[] args) {
            int[] array = {64, 34, 25, 12, 22, 11, 90};
            System.out.println("Original array:");
            printArray(array);

            quickSort(array, 0, array.length - 1);

            System.out.println("Sorted array:");
            printArray(array);
        }
    }


  /*This Java code implements the QuickSort algorithm with the first element as the pivot. Here's a breakdown of how it works:

1. The `quickSort` method is a recursive function that sorts an array by selecting a pivot element
 (in this case, the leftmost element) and partitioning the array such that all elements smaller than the pivot are on the left, and all elements larger are on the right. It then recursively sorts the subarrays before and after the pivot.

2. The `partition` method takes the array, low index, and high index as parameters.
It initializes `i` to `low + 1` and `j` to `high`.
It then iterates through the array while adjusting pointers `i` and `j` to find elements that are out of place and swaps them. Finally, it places the pivot element in its correct position and returns the partition index.

3. The `printArray` method simply prints the elements of an array.

4. In the `main` method, an array is initialized with values {64, 34, 25, 12, 22, 11, 90}, which is then printed. The `quickSort` method is called on this array, sorting it in place, and the sorted array is printed.

In summary, this code demonstrates the QuickSort algorithm using the first element as the pivot for partitioning the array into smaller subarrays. It then sorts these subarrays recursively to achieve the final sorted array.
*/