/**
 * 	@author Tim Harrold
 *	Subclass of: Guitar
 *	Superclass of: Warwick
 *	Defines the Bass object, meant to assign methods to any Warwick object
 */
public class Bass extends Guitar {

	private String tuning;

	public Bass(String color, int stringCount, String tune) {
		super("Bass", color, stringCount, tune);
	}
	/*
	 * Returns tuning instance data
	 */
	public String getTuning() {
		return tuning;
	}
	/*
	 * Prints the response for attempt to tune a bass guitar in console
	 */
	public void tuneTo(String tune) {
		System.out.println("You cannot tune your Bass guitar");
	}
	/*
	 * Prints the suffix of genres applicable to play on a Bass
	 */
	public void listGenres() {
		super.listGenres();
		System.out.print("Jazz, Rock, Metal, and basically anything else that has bass\n");
	}
}
