import java.util.Scanner;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check (UC6): ");
        String input = sc.nextLine();

        boolean isPalindrome = true;
        int n = input.length();

        for (int i = 0; i < n / 2; i++) {
            if (input.charAt(i) != input.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome!");
        } else {
            System.out.println(input + " is NOT a palindrome!");
        }
    }
}