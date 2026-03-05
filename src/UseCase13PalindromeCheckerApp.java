import java.util.Scanner;
import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Two-pointer approach
    public static boolean checkUsingTwoPointer(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Stack approach
    public static boolean checkUsingStack(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Measure time for Two-Pointer method
        long start1 = System.nanoTime();
        boolean result1 = checkUsingTwoPointer(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Measure time for Stack method
        long start2 = System.nanoTime();
        boolean result2 = checkUsingStack(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Display results
        System.out.println("\nTwo Pointer Method Result: " + result1);
        System.out.println("Execution Time: " + time1 + " ns");

        System.out.println("\nStack Method Result: " + result2);
        System.out.println("Execution Time: " + time2 + " ns");

        scanner.close();
    }
}
