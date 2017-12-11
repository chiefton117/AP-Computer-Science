/**
 * 	@author Tim Harrold
 *	Superclass in the Guitar hierarchy. Defines the Guitar object, and stores instance data for all guitar objects.
 */
public abstract class Guitar implements Comparable<Guitar>{

	private String type;
	private String color;
	private int strings;
	private String tuning;
	private boolean isAmplified = false;
	final String INSTRUMENT = "Guitar";
	
	public Guitar(String typeName, String guitarColor, int stringCount, String tune) {
		type = typeName;
		color = guitarColor;
		strings = stringCount;
		tuning = tune;
	}
	public static void aboutInstrument() {
		System.out.println("This is a guitar, you can use it to play music");
	}
	/*
	 * Amplifies the guitar, if it's not amplified
	 */
	public void amplify(Guitar guitar) {
		if(guitar.isAmplifiable() == true) {
			if(isAmplified == false) {
				isAmplified = true;
			}
			else isAmplified = false;
		}
	}
	private Boolean isAmplifiable() {
		if (this.type.toLowerCase() == "acoustic") {
			return false;
		}
		return true;
	}
	/*
	 * Prints the starting string to which genres each type of guitar might play(non-inclusive of the specific genres)
	 * Pre-condition: Must instantiate a Guitar object
	 * Post-condition: Console prints prefix result of genres
	 */
	public void listGenres() {
		System.out.print("This guitar is predisposed to play genres such as: ");
	}
	/*
	 * Returns instance data for type of guitar
	 */
	public String getType() {
		return type;
	}
	/*
	 * Returns instance data for color of guitar
	 */
	public String getColor() {
		return color;
	}
	/*
	 * Returns instance data for the number of strings of the guitar
	 */
	public int getStrings() {
		return strings;
	}
	/*
	 * Returns instance data for guitar tuning
	 */
	public String getTuning() {
		return tuning;
	}
	/*
	 * Sets the instance data for tuning of guitar
	 * @param desired tuning to be set
	 */
	public void setTuning(String tune) {
		tuning = tune;
	}
	/*
	 * Prints the result of guitar playing, inclusive of Brand, Type, and Tuning
	 * Pre-condition: Must instantiate a Guitar object
	 * Post-condition: Console prints result of guitar playing 
	 */
	public void play() {
		System.out.println("You play your " + this.getClass().getSimpleName() + " " + type + " Guitar in " + tuning + " tuning.");
	}
	/*
	 * Returns the toString value of invoking object(prints the guitar brand)
	 */
	public String toString() {
		return this.getClass().getSimpleName();
	}
	/*
	 * Compares toString value of invoking object to toString value of parameter object
	 * @param guitar object to be compared to invoking guitar object
	 */
	public int compareTo(Guitar guitar) {
		return this.toString().compareTo(guitar.toString());
	}
	/*
	 * Compares toString value of invoking object to toString value of parameter object
	 * @param guitar object to be compared to invoking guitar object
	 */
	public boolean equals(Guitar guitar) {
		return this.toString().equals(guitar.toString());
	}
}
