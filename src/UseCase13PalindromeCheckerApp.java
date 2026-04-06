import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Simple Two-Pointer Approach
    public static boolean twoPointerCheck(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Stack-Based Approach
    public static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "level";

        // Measure Two-Pointer method
        long startTime1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long endTime1 = System.nanoTime();

        // Measure Stack method
        long startTime2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long endTime2 = System.nanoTime();

        // Calculate execution times
        long time1 = endTime1 - startTime1;
        long time2 = endTime2 - startTime2;

        // Output results
        System.out.println("Input: " + input);

        System.out.println("\nTwo-Pointer Method:");
        System.out.println("Is Palindrome? " + result1);
        System.out.println("Execution Time: " + time1 + " ns");

        System.out.println("\nStack Method:");
        System.out.println("Is Palindrome? " + result2);
        System.out.println("Execution Time: " + time2 + " ns");
    }
}