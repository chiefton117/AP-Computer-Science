/**
 * 	@author Tim Harrold
 *	Subclass of: Guitar
 *	Superclass of: SteelStrung, Classical
 *	Defines the Acoustic object, meant to assign methods to any SteelStrung or Classical Guitar
 */
public class Acoustic extends Guitar implements Tuning {

	public String[] tunings = {"Drop D", "E Standard"};

	public Acoustic(String color, int stringCount, String tune) {
		super("Acoustic", color, stringCount, tune);
	}
	/*
	 * Tunes the guitar based on inputted tuning
	 * Pre-condition: Must instantiate an acoustic object
	 * Post-condition: sets Guitar tuning instance data to accepted tuning value
	 */
	public void tuneTo(String tune) {
		switch(tune.toLowerCase()) {
		case("drop d") : 
			this.setTuning("Drop D");
		break;
		case("e standard") : 
			this.setTuning("E Standard");
		break;
		default :
			System.out.println("Unrecognized tuning, valid tunings are: |");
			for(String tuning : tunings) {
				System.out.print(tuning + " | ");
			}
		}
	}

}
