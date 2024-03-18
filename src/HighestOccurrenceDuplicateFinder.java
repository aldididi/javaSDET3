import java.util.*;

public class HighestOccurrenceDuplicateFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the elements of the array
        System.out.print("Enter the elements of the array (separated by spaces): ");
        String input = scanner.nextLine();

        // Split the input string by spaces to get individual elements
        String[] elements = input.split(" ");

        // Convert the string elements to integers
        int[] numbers = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }

        // Find the duplicate element with the highest occurrence
        int duplicateWithHighestOccurrence = findDuplicateWithHighestOccurrence(numbers);

        if (duplicateWithHighestOccurrence != Integer.MIN_VALUE) {
            System.out.println("The duplicate element with the highest occurrence is: " + duplicateWithHighestOccurrence);
        } else {
            System.out.println("No duplicate elements found.");
        }

        scanner.close();
    }

    public static int findDuplicateWithHighestOccurrence(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        int duplicateWithMaxFrequency = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1 && entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                duplicateWithMaxFrequency = entry.getKey();
            }
        }

        return duplicateWithMaxFrequency;
    }
}

