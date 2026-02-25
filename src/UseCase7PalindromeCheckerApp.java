import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String input = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is \"" + input + "\" a palindrome? " + isPalindrome);
        sc.close();
    }
}