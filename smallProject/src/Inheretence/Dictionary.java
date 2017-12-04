package Inheretence;

public class Dictionary extends book {
		
	private String definition;
	
	public Dictionary(String name, int numPages, int numWords) {
		super(name, numPages, numWords, "It's a dictionary, it contains many words and definitions.");
	}
	public void addDefinition(String def) {
		
		super.addWords(1);
		definition = def;
		System.out.println("Definition successfuly added to " + this + " for: " + def);
	}
	public String toString() {
		return (this.getTitle());
	}
}