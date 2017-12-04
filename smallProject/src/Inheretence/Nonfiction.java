package Inheretence;

public class Nonfiction extends book implements Cover {
	
	public Nonfiction(String name, int numPages, int numWords) {
		super(name, numPages, numWords, "This is a nonfiction book, these events really happened!");
	}
	
	public void printCover() {
		System.out.println("In this world, all nonfiction books have soft covers");
	}
}
