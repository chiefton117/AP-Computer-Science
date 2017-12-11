/**
 * 	@author Tim Harrold
 *	Subclass of: Guitar
 *	Superclass of: Fender, Gibson, Ibanez
 *	Defines the Electric object, meant to assign methods to any Subclass of Electric
 */
public class Electric extends Guitar implements Tuning {

	public String[] tunings = {"A Standard", "Drop A", "B Standard", "Drop B", "C Standard", "Drop C", "D Standard", "Drop D", "E Standard"};

	public Electric(String color, int stringCount, String tune) {
		super("Electric", color, stringCount, tune);
	}
	/*
	 * Tunes the guitar based on inputted tuning
	 * Pre-condition: Must instantiate an electric object
	 * Post-condition: sets Guitar tuning instance data to accepted tuning value
	 */
	public void tuneTo(String tune) {
		switch(tune.toLowerCase()) {
		case("a standard") : 
			this.setTuning("A Standard");
		break;
		case("drop a") : 
			this.setTuning("Drop A");
		break;
		case("b standard") : 
			this.setTuning("B Standard");
		break;
		case("drop b") : 
			this.setTuning("Drop B");
		break;
		case("c standard") : 
			this.setTuning("C Standard");
		break;
		case("drop c") : 
			this.setTuning("Drop C");
		break;
		case("d standard") : 
			this.setTuning("D Standard");
		break;
		case("drop d") : 
			this.setTuning("Drop D");
		break;
		case("e standard") : 
			this.setTuning("E Standard");
		break;
		default :
			System.out.println("Unrecognized tuning, valid tunings are: ");
			for(String tuning : tunings) {
				System.out.print(tuning + " - ");
			}
		}
	}
	/*
	 * Lists the suffix of genres to be played with an Electric guitar
	 */
	public void listGenres() {
		super.listGenres();
		System.out.print("Rock, Metal, Country, Jazz\n");
	}

}
