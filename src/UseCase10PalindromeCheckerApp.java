public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Step 1: Normalize string
        // Remove non-alphanumeric characters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Check palindrome
        boolean isPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Input: " + input);
        System.out.println("Normalized: " + normalized);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}