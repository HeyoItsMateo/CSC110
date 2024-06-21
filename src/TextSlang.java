import java.util.Scanner;
/**
This program translates text-slang abbreviations into the full phrases.
*/
public class TextSlang {

	public static void main(String[] args) {
		// Initialize slang translation variable
		String phrase = "";
		// Initialize Scanner object to register user-inputs
		Scanner input = new Scanner(System.in);
		
		// Print program and programmer name for file validation
		System.out.println("TextSlang - Matthew Flores Semyonov\n");
		
		// Run translation process until the user enters the quit phrase
		while (!phrase.equals("Ta-Ta For Now")) {
			// Prompt user-input
			System.out.print("Enter a text slang term, TTFN to stop: ");
			// Store input as upper-case string
			String slang = input.nextLine().toUpperCase();
			// "Translate" the input text-slang by via switch-case statement
			switch(slang) {
				case "BAE":
					phrase = "Before Anyone Else"; break;
				case "BRB":
					phrase = "Be Right Back"; break;
				case "IDK":
					phrase = "I Don't Know"; break;
				case "IRL":
					phrase = "In Real Life"; break;
				case "JK":
				case "J/K":
					phrase = "Just Kidding"; break;
				case "LOL":
					phrase = "Laughing Out Loud"; break;
				case "STFU":
					phrase = "Shut The Front Door"; break;
				case "TTFN":
					phrase = "Ta-Ta For Now"; break;
				case "TTYL":
					phrase = "Talk To You Later"; break;
				case "WTF":
					phrase = "Why The Face?"; break;
				case "YOLO":
					phrase = "You Only Live Once"; break;
				default:
					phrase = ""; break;
			}
			// Check if input slang has a translation
			if (!phrase.equals("")) {
				// Tell the user what the slang means
				System.out.printf("%s means %s\n\n", slang, phrase);
				// Check if the slang/phrase is the quit signal
				if (slang.equals("TTFN")) {
					break; // Exit loop and finish the program if the quit signal "TTFN" is entered
				}
			}
			// If input slang does not have a translation, tell the user
			else {
				System.out.printf("I don’t know what %s means\n\n", slang);
			}
		}
		// Close the Scanner object
		input.close();
	}

}
