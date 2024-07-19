
public class Die {
	private int numSides = 6;
	private boolean frozen = false;
	private int value = 1;
	
	//Constructors
	
	// Creates a new, un-frozen Die with the given number of sides and initial
	// value of 1. Ensure that the number of sides > 1. If not, print a message and assume 6 sides.
	public Die(int numSides) {
		if (numSides < 1) {
			System.out.print("Invalid number of sides: ");
			System.out.println("numSides must be greater than 0!");
		}
		else {
			this.numSides = numSides;
		}
	}
	// Creates a new Die with 6 sides by using the constructor above.
	public Die() {
		numSides = 6;
	}
	
	//Accessors/Mutators
	
	// Sets the value of the Die, if the status is not frozen. If the Die is
	// frozen, ignore this request without a message. Ensure that the value is compatible with the
	// number of sides (0 < v <= numSides). If not, print a message and set the value to 1.
	public void setValue(int v) {
		if(!frozen) {
			if (0 < v && v <= numSides) {
				value = v;
			}
			else {
				System.out.printf("*** Attempted to set value to %d, assumed 1.\n", v);
				value = 1;
			}
		}
	}
	// Returns the value of the Die.
	public int getValue() {
		return value;
	}
	
	//Functions
	
	// “Roll the Die” and set the value to the resulting value.
	public void roll() {
		if (!frozen) {
			value = (int)(Math.random() * numSides) + 1;
		}
	}
	// Prints a simple graphic for the Die: “[n:x]”
	// where n is the value, x is the number of sides.
	public void print() {
		System.out.printf("[%d:%d]", value, numSides);
	}
	// If the number of sides <= 6, print a more realistic graphic for the Die.
	public void draw() {
		if (numSides <= 6) {
			System.out.println(".........");
			System.out.println(".       .");
			switch(value) {
			case 1:
				System.out.println(".       .");
				System.out.println(".   *   .");
				System.out.println(".       .");
				break;
			case 2:
				System.out.println(". *     .");
				System.out.println(".       .");
				System.out.println(".     * .");
				break;
			case 3:
				System.out.println(". *     .");
				System.out.println(".   *   .");
				System.out.println(".     * .");
				break;
			case 4:
				System.out.println(". *   * .");
				System.out.println(".       .");
				System.out.println(". *   * .");
				break;
			case 5:
				System.out.println(". *   * .");
				System.out.println(".   *   .");
				System.out.println(". *   * .");
				break;
			case 6:
				System.out.println(". *   * .");
				System.out.println(". *   * .");
				System.out.println(". *   * .");
				break;
			}
			System.out.println(".       .");
			System.out.println(".........");
		}
		else {
			print();
		}
	}
	// Set the status of the die so that it will not change value.
	public void freeze() {
		frozen = true;
	}
	// Set the status of the die so that it is allowed to change value.
	public void unfreeze() {
		frozen = false;
	}
}
