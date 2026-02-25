import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome!");
        } else {
            System.out.println(input + " is NOT a palindrome!");
        }
    }
}