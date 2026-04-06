import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

// Main class
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Choose strategy (can switch anytime)
        PalindromeStrategy strategy = new StackStrategy();
        // PalindromeStrategy strategy = new DequeStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
    }
}

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack-based strategy (LIFO)
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push all characters
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Compare with popped characters
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque-based strategy (FIFO + LIFO)
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        // Add characters
        for (char ch : input.toCharArray()) {
            deque.add(ch);
        }

        // Compare from both ends
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}