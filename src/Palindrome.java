import java.util.Scanner;

public class Palindrome {
	@SuppressWarnings("unused")
	// Created this before realizing that the instructions were to use the method Character.isLetter(char c), rather than to create a new method called isLetter
	private static boolean isLetter(char c) {
		// Initialize array of letters in the alphabet; is array indexing is faster than .charAt() calls?
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		// Check character against each letter in the alphabet
		for (char letter : alphabet) {
			if (c == letter) {
				return true;
			}
		}
		return false;
	}
	private static String cleanPhrase(String phrase) {
		// Initialize String to hold cleaned phrase (no spaces or punctuation)
		String cleaned = "";
		// Check each character in the phrase
		for(int i = 0; i < phrase.length(); i++) {
			// Store current character to reduce calls to .charAt()
			char currChar = phrase.charAt(i);
			if(Character.isLetter(currChar)) {
				// Scrub phrase and store only letters in cleaned phrase
				cleaned += currChar;
			}
		}
		return cleaned;
	}
	private static void isPalindrome(String phrase) {
		// Loop through phrase from start and from end
		for(int i = 0, j = phrase.length()-1; i < phrase.length()/2; i++, j--) {
			// Compare characters at both ends of phrase for similarity
			if (phrase.charAt(i) != phrase.charAt(j)) {
				// If characters don't match, exit method and print:
				System.out.println("That is NOT a Palindrome");
				return;
			}
		}
		// Characters match forwards and backwards, exit method and print:
		System.out.println("That is a Palindrome");
		return;
	}
	
	public static void main(String[] args) {
		// Initialize variables
		String phrase = "";
		Scanner input = new Scanner(System.in);
		// Print file/project name for grading validation
		System.out.println("Palindrome Checker - Matthew Flores Semyonov\n");
		
		// Prompt user-input for a phrase to check
		System.out.print("Enter phrase: ");
		// Scrub the phrase of spaces and punctuation, then store the phrase
		phrase = cleanPhrase(input.nextLine().toUpperCase());
		// Check if the word/phrase is a palindrome
		isPalindrome(phrase);
		// Close Scanner for completion
		input.close();


	}

}
