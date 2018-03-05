/**
 * 	@author Tim Harrold
 *	Subclass of: Acoustic
 *	Superclass of: Yamaha
 *	Defines the Classical object, meant to emulate and catagorize an acoustic object as Classical
 */
public class Classical extends Acoustic {

	public Classical(String color, int stringCount, String tune) {
		super(color, stringCount, tune);	
	}
	public void listGenres() {
		super.listGenres();
		System.out.print("Folk, Indie Rock, and Classical\n");
	}
}
