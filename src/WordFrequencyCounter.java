import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the paragraph
        System.out.println("Enter the paragraph:");
        String paragraph = scanner.nextLine();

        // Split the paragraph into words
        String[] words = paragraph.split("\\s+");

        // Create a TreeMap to store words and their frequencies in alphabetical order
        TreeMap<String, Integer> wordFrequencyMap = new TreeMap<>();

        // Count the frequency of each word
        for (String word : words) {
            // Remove punctuation marks
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            // Convert to lowercase to ignore case sensitivity
            word = word.toLowerCase();
            // Update the frequency map
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        // Sort the word frequency map by keys (words)
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordFrequencyMap.entrySet());
        Collections.sort(sortedEntries, Comparator.comparing(Map.Entry::getKey));

        // Display the word frequencies in alphabetical order
        System.out.println("Word frequencies in alphabetical order:");
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
