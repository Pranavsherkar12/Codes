import java.util.Scanner;

public class LexicographicalCountingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] count = new int[256]; // ASCII characters count array

        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            count[ch]++;
        }

        // Build sorted string
        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            while (count[i] > 0) {
                sortedString.append((char) i);
                count[i]--;
            }
        }

        System.out.println("Sorted String: " + sortedString);
    }
}

//TC: O(n)
