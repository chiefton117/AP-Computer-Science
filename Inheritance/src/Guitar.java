
public abstract class Guitar {
	
	private String brand;
	private String color;
	private int strings;
	private String tuning;
	public String[] tunings = {"A Standard", "Drop A", "B Standard", "Drop B", "C Standard", "Drop C", "D Standard", "Drop D", "E Standard"};
	
	public Guitar(String brandName, String guitarColor, int stringCount, String tune) {
		brand = brandName;
		color = guitarColor;
		strings = stringCount;
		tuning = tune;
	}
	public String getBrand() {
		return brand;
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
	public void play() {
		System.out.println("You play your " + brand + " " + this.getClass().getSimpleName() + " Guitar in " + tuning + " tuning.");
	}
	public String toString() {
		return this.getBrand();
	}
}
