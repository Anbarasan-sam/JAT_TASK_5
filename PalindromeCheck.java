package guviTask5;
import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);       
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();
		str = str.replaceAll("\\s", "").toLowerCase();
		boolean isPalindrome = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
		scanner.close();
	}
}
