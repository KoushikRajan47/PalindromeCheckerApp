/**
 * =====================================================
 * MAIN CLASS – UseCase7PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a Deque data structure by comparing characters
 * from the front and rear.
 *
 * @author Developer
 * @version 7.0
 */

import java.util.*;

public class UseCase7PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "madam";

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
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