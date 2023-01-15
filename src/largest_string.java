
import java.util.HashSet;

public class largest_string {

    public static class CompoundWord {
        public static String solve(String[] words) {
            HashSet<String> set = new HashSet<>(); // Create a hash set to store all words

            // Add all words to the hash set
            for (String word : words) {
                set.add(word);
            }

            String longest = ""; // Initialize the longest compound word to an empty string

            // Iterate through all words
            for (String word : words) {
                // Check if the word is a compound word
                if (isCompoundWord(word, set)) {
                    // If the word is a compound word and its length is greater than the current longest word, update the longest word
                    if (word.length() > longest.length()) {
                        longest = word;
                    }
                }
            }

            return longest; // Return the longest compound word
        }

        private static boolean isCompoundWord(String word, HashSet<String> set) {
            for (int i = 1; i < word.length(); i++) {
                // Check if the left and right parts of the word are in the set
                if (set.contains(word.substring(0, i)) && set.contains(word.substring(i))) {
                    return true; // If both parts are in the set, the word is a compound word
                }
            }
            return false; // If no compound word is found, return false
        }
    }

    public static void main(String[] args) {
        String[] input = {"mouse", "state", "road", "cat", "catch", "building", "catcher", "chase", "dog", "when", "dogcatcher", "tunnel"};
        String longestCompoundWord = CompoundWord.solve(input);
        System.out.println("Longest Compound Word: " + longestCompoundWord);
    }
}