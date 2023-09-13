import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        int length = input.length();

        // Iterate from both ends of the string and compare characters.
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                System.out.println("The string is not a palindrome.");
                scanner.close();
                return; // Characters don't match, not a palindrome.
            }
        }
        
        System.out.println("The string is a palindrome.");
        scanner.close();
    }
}
