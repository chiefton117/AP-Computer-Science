package Inheretence;

public class Words {
	

	public static void main(String[] args) {
		book oxford = new Dictionary("Oxford", 250, 10000);
		book stranger = new Fiction("The Stranger", 300, 5000);
		book diary = new Nonfiction("The Diary of Anne Frank", 293, 1834);
		book clockworkOrange = new Fiction("A Clockwork Orange", 320, 4382);
		book studentsDictionary = new Dictionary("The Students Dictionary", 685, 2345);
		
		book[] library = new book[]{oxford, stranger, diary, clockworkOrange, studentsDictionary};
		System.out.println();
		for(book thisBook : library) {
			thisBook.aboutBook();
			System.out.println();
		}
		System.out.println();
		
	}
}
