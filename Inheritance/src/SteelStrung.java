/**
 * 	@author Tim Harrold
 *	Subclass of: Acoustic
 *	Superclass of: Taylor
 *	Defines the SteelStrung object, meant to emulate and define an Acoustic Guitar as Steel Strung
 */
public class SteelStrung extends Acoustic {
	
	public SteelStrung(String color, int stringCount, String tune) {
		super(color, stringCount, tune);	
	}
	public void listGenres() {
		super.listGenres();
		System.out.print("Country, Soft Rock, and Indie\n");
	}
}
