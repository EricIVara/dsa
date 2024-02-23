public class QuickSort {
    /* This method sorts an array using QuickSort algorithm */
    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    /* The main function that implements QuickSort
     * array[] --> Array to be sorted,
     * low  --> Starting index,
     * high  --> Ending index */
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            /* pi is partitioning index, array[pi] is now at right place */
            int pi = partition(array, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    /* This function takes last element as pivot, places the pivot element at its correct
       position in sorted array, and places all smaller (smaller than pivot) to left of
       pivot and all greater elements to right of pivot */
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (array[j] < pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
