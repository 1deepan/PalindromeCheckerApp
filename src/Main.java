import service.PalindromeService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        boolean result = PalindromeService.isPalindrome(input);

        System.out.println(result ? "Palindrome ✅" : "Not Palindrome ❌");
    }
}
