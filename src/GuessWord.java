import java.util.Scanner;

public class GuessWord {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      in.useDelimiter("");// To effectively do a nextChar-esque statement
      
      String guesses = "";
      System.out.println("Guess-a-Word - Matthew Flores Semyonov\n");
     
      String word = pickWord();

      do {
         printWord(word, guesses);
         guesses += getUniqueGuess(in, guesses);
      } while (!wordGuessed(word, guesses));

      printWord(word, guesses);

      System.out.printf("\nYou guessed it in %d tries\n", guesses.length());

      in.close();
   }  
   private static String pickWord() {
	   String[] dictionary = {
			   "DOG",
			   "CAT",
			   "ELEPHANT",
			   "WORD",
			   "DICTIONARY",
			   "CAR",
			   "TRUCK",
			   "VAN",
			   "APPLE",
			   "BANANA",
			   "PEAR"
			   };
	   // Pick a random word out of the dictionary
	   int randWord = (int) (Math.random() * dictionary.length);
	   // Return the random word
	   return dictionary[randWord];
   }
   private static void printWord(String word, String guesses) {
	   // Print blank spaces for word
	   for (int i = 0; i < word.length(); i++) {
		   // No guesses, so print out the empty word
		   if (guesses.length() == 0) {
			   System.out.print("_ ");
		   }
		   // Loop through guessed letters, will get skipped if no guesses have been made
		   for (int j = 0; j < guesses.length(); j++) {
			   if (word.charAt(i) == guesses.charAt(j)) {
				   System.out.print(guesses.charAt(j) + " ");
				   break;// Don't want to keep searching and trigger the else if statement, so exit loop early
			   }
			   else if (j == guesses.length() - 1) {
				   System.out.print("_ "); // Case where none of the letters match
			   }
		   }
	   }
	   // Print out the players current list of guesses
	   System.out.printf("\tUsed letters: {%s}\n", guesses);
   }
   private static String getUniqueGuess(Scanner in, String guesses) {
	   // Initialize variables
	   String inputGuess = "";
	   Boolean uniqueGuess_Flag = false;
	   // Loop until valid input is acquired
	   do {
		   System.out.print("Guess a letter: ");
		   inputGuess = in.next().toUpperCase();
		   in.nextLine(); // Burn next line character
		   // Automatic uniqueness case, no guesses yet
		   if (guesses.length() == 0) {
			   uniqueGuess_Flag = true;
		   }
		   // Compare input to list of guesses for uniqueness
		   for (int i = 0; i < guesses.length(); i++) {
			   if (inputGuess.charAt(0) == guesses.charAt(i)) {
				   System.out.printf("You already guessed %s!\n", inputGuess);
				   break; // Exit for-loop early to prompt for a unique guess
			   } else if (i == guesses.length() - 1) {
				   // If a match is not found by the end of the loop, it must be unique
				   uniqueGuess_Flag = true; // so trigger the flag, and exit do-while loop
			   }
		   }
	   } while (!uniqueGuess_Flag);
	   
	   return inputGuess;
   }
   private static Boolean wordGuessed(String word, String guesses) {
	   int correctness = 0;
	   // Loop through word and list of guesses
	   for (int i = 0; i < word.length(); i++) {
		   for (int j = 0; j < guesses.length(); j++) {
			   // Increment correctness if a guessed letter matches any of the ones in the word
			   if (word.charAt(i) == guesses.charAt(j)) {
				   correctness++;
			   }
		   }
	   }
	   if (correctness == word.length()) {
		// the number of correct guesses match the length of the word
		   return true;
	   }
	   return false;
   }
   // Other Methods
}