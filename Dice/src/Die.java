/**
 * Simulates and returns the result of a rolled Dice, giving a value 1 - 6
 * State - Integer 1 - 6
 * Behavior - Rolls to generate a new random number 1 - 6
 */
public class Die {
	private int Dice; //Instance Data
	private int Sides;
	
	
	public int Sides(int sides) {
		sides = 6;
		return sides;
	}
	public Die() { //Constructor Method
		Dice = roll();
	}
/**
 * Rolls dice, returning integer
 * @return Result of roll as integer 1 - 6
 */
	public int roll() { //Class method
		int result = (int)(Math.random() * 6 + 1);
		return result;
	}
	public String toString() {
		String stResult = Integer.toString(Dice);
		return stResult;
	}
}
