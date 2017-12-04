
public class Acoustic extends Guitar implements Tuning {

	private String tuning;

	public Acoustic(String brandName, String color, int stringCount, String tune) {
		super(brandName, color, stringCount, tune);
		tuning = tune;
	}
	public String getTuning() {
		return tuning;
	}
	public void tuneTo(String tune) {
		switch(tune.toLowerCase()) {
		case("a standard") : 
			tuning = "A Standard";
			break;
		case("drop a") : 
			tuning = "Drop A";
			break;
		case("b standard") : 
			tuning = "B Standard";
			break;
		case("drop b") : 
			tuning = "Drop B";
			break;
		case("c standard") : 
			tuning = "C Standard";
			break;
		case("drop c") : 
			tuning = "Drop C";
			break;
		case("d standard") : 
			tuning = "D Standard";
			break;
		case("drop d") : 
			tuning = "Drop D";
			break;
		case("e standard") : 
			tuning = "E Standard";
			break;
		default :
			System.out.println("Unrecognized tuning, valid tunings are: ");
			for(String tuning : tunings) {
				System.out.print(tuning + " - ");
			}
		}
	}
}
