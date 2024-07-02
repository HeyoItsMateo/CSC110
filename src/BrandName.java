/**
This program uses random number generation to create brand names.
*/
public class BrandName {
	private static String generateName(int size) {
		// Initialize letters list lengths for random selection
		int numVowels = 5;
		int numConsonants = 19;
		// Initialize letter and name storage variables
		char letter = ' ';
		String name = "";
		// Loop through each letter of the desired name length
		for(int i = 1; i <= size; i++) {
			if(i % 2 == 0) {// Assign a random vowel
				int randVowel = (int) (Math.random() * numVowels); // Set RNG span to number of vowels
				letter = "aeiou".charAt(randVowel); // Vowel assignment
			}
			else {// Assign a random consonant
				int randConsonant = (int) (Math.random() * numConsonants); // Set RNG span to number of consonants
				letter = "bcdfghjklmnprstvwxz".charAt(randConsonant); // Consonant assignment
			}
			if (i == 1) {// Make first letter uppercase
				letter = Character.toUpperCase(letter);
			}
			// Create name by adding a letter at a time.
			name += letter;
		}
		// Return the completed name
		return name;
	}
	public static void main(String[] args) {
		System.out.println("Brand Name Generator - Matthew Flores Semyonov\n");
		// Print 10 names
		for (int i = 1; i <= 10; i++) {
			// Random length for name, between 6 and 12
			int nameLength = (int)(Math.random() * 7) + 6;
			// Generate and print a random name
			String name = generateName(nameLength);
			System.out.printf("%d) %s\n", i, name);
		}

	}

}
