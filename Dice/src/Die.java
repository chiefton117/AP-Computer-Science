/**
 * Simulates and returns the result of a rolled Dice, giving a value 1 - 6
 * State - Integer 1 - 6
 * Behavior - Rolls to generate a new random number 1 - 6
 */
public class Die {
	private int Sides;
	private int Dice; //Instance Data
	
	public Die() { //Constructor Method
		Dice = roll();
	}
	public void setSides(int sides) {
		Sides = sides;
	}
	public int getSides() {
		return Sides;
	}
/**
 * Rolls dice, returning integer
 * @return Result of roll as integer 1 - 6
 */

	public int roll() {
		Dice = (int)(Math.random() * 6 + 1);
		 return Dice;
		
	}
	public String toString() {
		String stResult = Integer.toString(Dice);
		return stResult;
	}
	public boolean isDoubles(Die dice2) {
		if (Integer.toString(this.Dice).equals(dice2.toString())) {
			return true;
		}
		else return false;
	}
}
