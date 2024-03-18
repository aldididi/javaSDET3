public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 8, 15}; // Example array of integers

        int largest = findLargestElement(numbers);

        System.out.println("The largest element in the array is: " + largest);
    }

    public static int findLargestElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int largest = arr[0]; // Assume the first element is the largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if we find a larger element
            }
        }

        return largest;
    }
}
