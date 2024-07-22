
public class PokerDice {

	public static void main(String[] args) {
		// Initialize the number of trials to run the simulation
		int numTrials = 1000000;		
		// Initialize a poker-dice hand of five dice
		int handSize = 5; // Five "cards" in per hand
		Die dice = new Die(6);
		// Initialize the number of each type of hand for odds calculation
		int[] numTypes = new int[7];
		// Initialize variables to store the odds of each hand
		double[] odds = new double[7];
		// Initialize names of hand types
		String[] handNames = {
				"None Alike",
				"One Pair",
				"Two Pair",
				"Three of a Kind",
				"Full House",
				"Four of a Kind",
				"Five of a Kind"
		};
		// Loop to roll the five dice for the number of trials
		// to collect data for odds of each poker hand
		for(int i = 0; i < numTrials; i++) {
			// Create hand to store values from each die
			int[] hand = new int[handSize];
			// Roll each die and store values to the hand
			for(int j = 0; j < handSize; j++) {
				dice.roll();
				hand[j] = dice.getValue();
			}

			// Determine the type of hand (one pair, two pair, three pair, etc.)
			String handType = getHandType(hand, handSize);
			// Increment and store the number of hand-type for odds calculation
			switch(handType) {
			case "None Alike":
				numTypes[0]++;
				break;
			case "One Pair":
				numTypes[1]++;
				break;
			case "Two Pair":
				numTypes[2]++;
				break;
			case "Three of a Kind":
				numTypes[3]++;
				break;
			case "Full House":
				numTypes[4]++;
				break;
			case "Four of a Kind":
				numTypes[5]++;
				break;
			case "Five of a Kind":
				numTypes[6]++;
				break;
			}
		}
		
		// Calculate the odds of each hand
		for (int i = 0; i < 7; i++) {
			odds[i] = (double) numTypes[i] / numTrials;
		}
		
		// Print out the results of the Poker-Dice simulation
		// Print statement for class and student verification
		System.out.println("Poker Dice Probability Calculator - Matthew Flores Semyonov");
		// Print statement to show how many trials will be run
		System.out.printf("Running %d trials\n\n", numTrials);
		// Print out the odds of occurrence for each case
		for (int i = 0; i < handNames.length; i++) {
			System.out.printf("Case %d, %15s, is %f\n", i+1, handNames[i], odds[i]);
		}
	}
	
	private static String getHandType(int[] hand, int handSize) {
		String handType = "";
		int firstPairValue = 0;
		int secondPairValue = 0;
		int numFirst = 1;
		int numSecond = 1;
		// Loop through each "card" in the hand
		for (int i = 0; i < handSize; i++) {
			// Compare each "card" to another
			for (int j = 0; j < handSize; j++) {
				// Ensure that each card is counted once, by removing the card from the hand
				if (i != j & (hand[i] !=0 & hand[j] != 0)) {
					if (hand[i] == hand[j] & firstPairValue == 0) {
						firstPairValue = hand[i];
						hand[j] = 0; // Remove the card from the hand to only count it once
						numFirst++;
						break;
					}
					else if (hand[i] == hand[j] & hand[i] == firstPairValue) {
						numFirst++;
						break;
					}
					else if(hand[i] == hand[j] & secondPairValue == 0) {
						secondPairValue = hand[i];
						hand[j] = 0; // Remove the card from the hand to only count it once
						numSecond++;
						break;
					}
					else if (hand[i] == hand[j] & hand[i] == secondPairValue) {
						numSecond++;
						break;
					}
					
				}
			}
		}
		// Determine the type of hand based on number of pairs/
		if ((numFirst == 2 & numSecond == 1) | (numFirst == 1 & numSecond == 2)) {
			handType = "One Pair";
		}
		else if (numFirst == 2 & numSecond == 2) {
			handType = "Two Pair";
		}
		else if (numFirst == 3 | numSecond == 3) {
			if (numSecond == 2 | numFirst == 2) {
				handType = "Full House";
			}
			else {
				handType = "Three of a Kind";
			}
		}
		else if (numFirst == 4 | numSecond == 4) {
			handType = "Four of a Kind";
		}
		else if (numFirst == 5 | numSecond == 5) {
			handType = "Five of a Kind";
		}
		else {
			handType = "None Alike";
		}
		return handType;
	}

}
