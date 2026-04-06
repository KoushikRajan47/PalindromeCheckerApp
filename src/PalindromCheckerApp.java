import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {


        String input = "civic";


        Queue<Character> queue = new LinkedList<>();


        Stack<Character> stack = new Stack<>();


        for (char ch : input.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }


        boolean isPalindrome = true;


        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();   // FIFO
            char fromStack = stack.pop();      // LIFO

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}