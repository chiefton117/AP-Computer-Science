package Inheretence;

public class book extends Interact implements Cover {
	
	private String title;
	private int pages;
	private int words;
	private int page;
	private String about;
	
	public book(String name, int pageNum, int numWords, String description) {
		title = name;
		pages = pageNum;
		words = numWords;
		about = description;
	}
	public int getPages() {
		return pages;
	}
	public void toPage(int pageNum) {
		if(pageNum > pages) {
			System.out.println("There aren't that many pages of " + title + "!");
		}
		else {
			page = pageNum;
			System.out.println("You are now on page " + page + " of " + title);
		}
	}
	public int getPage() {
		return page;
	}
	public void read() {
		System.out.println("You read the book, it was alright I guess");
	}
	public void aboutBook() {
		System.out.println(title);
		System.out.println(title + " is a " + this.getClass().getSimpleName() + " book with " + words + " words");
		System.out.println("Description: " + about);
	}
	public int getWords() {
		return words;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPages(int pageNum) {
		pages = pageNum;
	}
	
	public void addWords(int numWords) {
		words += numWords;
	}
	
	public void printCover() {
		System.out.println("This book does have a cover, what kind is it?");
	}
	
	public String toString() {
		return this.toString();
	}
}
