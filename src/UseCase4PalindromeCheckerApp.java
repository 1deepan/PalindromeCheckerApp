import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check (UC4): ");
        String input = sc.nextLine();

        char[] chars = input.toCharArray();
        int start = 0, end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome!");
        } else {
            System.out.println(input + " is NOT a palindrome!");
        }
    }
}