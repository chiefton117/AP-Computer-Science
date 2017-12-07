
public abstract class Guitar implements Comparable<Guitar>{

	private String type;
	private String color;
	private int strings;
	private String tuning;

	public Guitar(String typeName, String guitarColor, int stringCount, String tune) {
		type = typeName;
		color = guitarColor;
		strings = stringCount;
		tuning = tune;
	}
	public void listGenres() {
		System.out.print("This guitar is predisposed to play genres such as: ");
	}
	public String getType() {
		return type;
	}
	public String getColor() {
		return color;
	}
	public int getStrings() {
		return strings;
	}
	public String getTuning() {
		return tuning;
	}
	public void setTuning(String tune) {
		tuning = tune;
	}
	public void play() {
		System.out.println("You play your " + this.getClass().getSimpleName() + " " + type + " Guitar in " + tuning + " tuning.");
	}
	public String toString() {
		return this.getClass().getSimpleName();
	}
	public int compareTo(Guitar guitar) {
		return this.toString().compareTo(guitar.toString());
	}
	public boolean equals(Guitar guitar) {
		return this.toString().equals(guitar.toString());
	}
}
