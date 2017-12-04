
public class Musician {

	public static void main(String[] args) {
		Acoustic myGuitar = new Acoustic("Taylor", "Blue", 6, "E Standard");
		System.out.println(myGuitar);
		System.out.println(myGuitar.getColor());
		System.out.println(myGuitar.getStrings());
		System.out.println(myGuitar.getTuning());
		System.out.println();
		myGuitar.tuneTo("Drop F");
		System.out.println();
		System.out.println();
		myGuitar.play();

	}

}
