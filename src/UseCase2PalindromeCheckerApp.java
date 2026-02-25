public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        String palindrome = "madam";
        String reversed = new StringBuilder(palindrome).reverse().toString();

        if (palindrome.equals(reversed)) {
            System.out.println(palindrome + " is a palindrome!");
        } else {
            System.out.println(palindrome + " is NOT a palindrome!");
        }
    }
}