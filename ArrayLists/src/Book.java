import java.util.ArrayList;


public class Book implements Comparable<Book> {

	private int pages;
	private String title;
	private String type;
	
	public Book(String ti, String ty, int p) {
		pages = p;
		title = ti;
		type = ty;
	}
	public int getPages() {
		return pages;
	}
	public String getTitle() { 
		return title;
	}
	public String getType() {
		return type;
	}
	public String toString() {
		return title;
	}
	public int compareTo(Book bk) {
		return this.toString().compareTo(bk.toString());
	}
	/*
	public double getAverage(Book[] bka) {
		int sum = 0;
		for(Book bk : bka) {
			sum += bk.pages;
		}
		return sum / bka.length;
	}
	*/
	public static double getAverage(ArrayList<Book> bka) {
		int sum = 0;
		for(Book bk : bka) {
			sum += bk.pages;
		}
		return sum / bka.size();
	}
}
