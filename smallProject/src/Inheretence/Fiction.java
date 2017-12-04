package Inheretence;

public class Fiction extends book implements Cover {
	
	public Fiction(String name, int numPages, int numWords) {
		super(name, numPages, numWords, "This is a fiction book");
	}
	
	public void printCover() {
		System.out.println("In this world, all fiction books have hard covers");
	}
}