package guviTask5;

import java.util.Scanner;

public class ReverseString {


	public static void main (String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
			System.out.println("Enter the String : ");
			
			String str = scanner.nextLine();
			
			String reversedStr="";
			 for (int i = str.length() - 1; i >= 0; i--) {
		            reversedStr += str.charAt(i);
			 
			 }
			 
			 System.out.println("Reversed string: " + reversedStr);
		        
		        scanner.close();
	}
}