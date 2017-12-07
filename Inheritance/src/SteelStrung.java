
public class SteelStrung extends Acoustic {
	
	public SteelStrung(String color, int stringCount, String tune) {
		super(color, stringCount, tune);	
	}
	public void listGenres() {
		super.listGenres();
		System.out.print("Country, Soft Rock, and Indie\n");
	}
}
