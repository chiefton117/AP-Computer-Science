
public class Musician {

	public static void main(String[] args) {
		Guitar CE = new Taylor("Blue", 6, "E Standard");
		Guitar Strat = new Fender("blue", 6, "E Standard");
		Guitar RG = new Ibanez("Gray", 7, "Drop C");
		Guitar Corvette = new Warwick("Gray", 4, "Drop C");
		Guitar SG = new Gibson("Sunburst", 6, "Drop D");
		Guitar Classical = new Yamaha("Oak", 6, "E Standard");
		
		Guitar[] guitars = new Guitar[]{CE, Strat, RG, Corvette, SG, Classical};
		for(Guitar guitar : guitars) {
			System.out.println("This is a " + guitar.getColor() + " " + guitar.toString() + " guitar with " + guitar.getStrings() + " strings.");
			guitar.play();
			System.out.println();
		}
	}
}
