
public class Bass extends Guitar {

	private String tuning;
	
	public Bass(String color, int stringCount, String tune) {
		super("Bass", color, stringCount, tune);
	}
	public String getTuning() {
		return tuning;
	}
	public void tuneTo(String tune) {
		System.out.println("You cannot tune your Bass guitar");
	}
}
