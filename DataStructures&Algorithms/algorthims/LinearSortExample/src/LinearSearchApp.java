public class LinearSearchApp {
    public static void main(String[] args) {
        // Example array to search in
        int[] data = {23, 45, 67, 89, 123, 145, 167, 189};

        // The value to search for
        int target = 123;

        // Assuming the LinearSearch class has a static method called 'find'
        // which returns the index of the target value or -1 if not found
        int resultIndex = LinearSearch.search(data, target);

        // Print the result
        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found.");
        }
    }
}
