import java.util.ArrayList;
import java.util.ListIterator;

public class Library {

	public static void main(String[] args) {
		
		Softcover b1 = new Softcover("The Stranger", 125);
		Hardcover b2 = new Hardcover("Harry Potter", 405);
		Softcover b3 = new Softcover("Siddhartha", 107);
		Hardcover b4 = new Hardcover("VALIS", 354);
		Softcover b5 = new Softcover("Moby Dick", 653);
		Hardcover b6 = new Hardcover("Dune", 762);
		Softcover b7 = new Softcover("Atlas Shrugged", 1098);
		Hardcover b8 = new Hardcover("Nausea", 153);
		
		ArrayList<Book> collection = new ArrayList();
		collection.add(b1);
		collection.add(b2);
		collection.add(b3);
		collection.add(b4);
		collection.add(b5);
		collection.add(b6);
		collection.add(b7);
		collection.add(b8);
		
		for(Book book : collection) {
			System.out.println(book);
			System.out.println(book.getPages() + " pages");
		}
		System.out.println(Book.getAverage(collection));
		
		ListIterator<Book> it = collection.listIterator();
		int sum = 0;
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
