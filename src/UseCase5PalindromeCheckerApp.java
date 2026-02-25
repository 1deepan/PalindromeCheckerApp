

import java.util.Scanner;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check (UC5): ");
        String input = sc.nextLine();

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println(input + " is a palindrome (ignoring case/spaces)!");
        } else {
            System.out.println(input + " is NOT a palindrome (ignoring case/spaces)!");
        }
    }
}