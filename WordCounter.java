import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Count words
        int wordCount = countWords(input);

        // Display result
        System.out.println("Word count: " + wordCount);

        scanner.close();
    }

    // Method to count words in a string
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
