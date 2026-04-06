/**
 * =====================================================
 * MAIN CLASS – UseCase6PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using both Queue and Stack data structures.
 *
 * @author Developer
 * @version 6.0
 */

import java.util.*;

public class UseCase6PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into queue and stack
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);     // Enqueue
            stack.push(ch);    // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        for (int i = 0; i < input.length(); i++) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}