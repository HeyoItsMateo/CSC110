
public class DieDriver {
	
	public static void main(String[] args) {
		System.out.println("Die Driver - Matthew Flores Semyonov\n");
		
		// Testing creation of dice
		System.out.println("1. Creation of Die\n");
		// Initialize dice objects
		Die d1 = new Die();
		Die d2 = new Die(4);
		Die d3 = new Die(10);
		// Print out the dice
		System.out.print("\ta) ");
		d1.print();
		System.out.print("\n\tb) ");
		d2.print();
		System.out.print("\n\tc) ");
		d3.print();
		
		// Testing setting of dice values
		System.out.println("\n\n2. Setting Value of Die\n");
		// Set the values of the dice
		d1.setValue(3);
		d2.setValue(5);
		d3.setValue(0);
		// Print out the dice
		System.out.print("\ta) ");
		d1.print();
		System.out.print("\n\tb) ");
		d2.print();
		System.out.print("\n\tc) ");
		d3.print();
		
		// Testing freezing of dice
		System.out.println("\n\n3. Freezing a Die\n");
		// Freeze then set value of the dice
		d1.freeze();
		d1.setValue(5);
		// Print out the dice
		System.out.print("\ta) ");
		d1.print();
		// Un-freeze then set value of the dice
		d1.unfreeze();
		d1.setValue(5);
		// Print out the dice
		System.out.print("\n\tb) ");
		d1.print();
		
		// Testing the drawing of dice
		System.out.println("\n\n4. Drawing a Die\n");
		// Print out the dice
		System.out.print("\ta)\n");
		d1.draw();
		System.out.print("\tb)\n");
		d2.draw();
		System.out.print("\tc)\n");
		d3.draw();
		
		// Testing the rolling of dice
		System.out.println("\n\n5. Rolling a Die\n");
		// Rolling the dice
		System.out.print("\ta) ");
		for (int i = 0; i < 10; i++) {
			d1.roll();
			d1.print();
			System.out.print(" ");
		}
		System.out.print("\n\tb) ");
		for (int i = 0; i < 3; i++) {
			d2.roll();
			d2.print();
			System.out.print(" ");
		}
		System.out.print("\n\tc) ");
		for (int i = 0; i < 10; i++) {
			d3.roll();
			d3.print();
			System.out.print(" ");
		}
	}

}
