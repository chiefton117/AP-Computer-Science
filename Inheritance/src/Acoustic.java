
public class Acoustic extends Guitar implements Tuning {

	public String[] tunings = {"Drop D", "E Standard"};

	public Acoustic(String color, int stringCount, String tune) {
		super("Acoustic", color, stringCount, tune);
	}
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
