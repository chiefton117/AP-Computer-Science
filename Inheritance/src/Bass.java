
public class Bass extends Guitar {

	private String tuning;
	
	public Bass(String brandName, String color, int stringCount, String tune) {
		super(brandName, color, stringCount, tune);
	}
	public String getTuning() {
		return tuning;
	}
	public void tuneTo(String tune) {
		System.out.println("You cannot tune your Bass guitar");
	}
}
