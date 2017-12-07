
public class Classical extends Acoustic {

	public Classical(String color, int stringCount, String tune) {
		super(color, stringCount, tune);	
	}
	public void listGenres() {
		super.listGenres();
		System.out.print("Folk, Indie Rock, and Classical\n");
	}
}
