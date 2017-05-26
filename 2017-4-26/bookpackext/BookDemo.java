package bookpackext;
import bookpack.Book;
import bookpack.bookpackinner.SubBook;

class ExtBook extends Book {
	private String publisher;

	ExtBook(String t, String a, int p1, String p2) {
		super(t, a, p1);
		publisher = p2;
	}

	public void show() {
		super.show();
		System.out.println(publisher);
		System.out.println();
	}

	public void setPublisher(String x) {
		publisher = x;
	}

	public String setPublisher() {
		return publisher;
	}
}


class BookDemo {
	public static void main(String[] args) {
		ExtBook books[] = new ExtBook[5];

		books[0] = new ExtBook("Java: A Beginner's Guide", "Schildt", 2014, "McGraw-Hill Professional");
		books[1] = new ExtBook("Java: The Complete Reference", "Schildt", 2014, "McGraw-Hill Professional");
		books[2] = new ExtBook("The Art of Java", "Schildt and Holmes", 2003, "McGraw-Hill Professional");
		books[3] = new ExtBook("Red Storm Rising", "Clancy", 1986, "Putnam");
		books[4] = new ExtBook("On the Road", "Kerouac", 1955, "Viking");

		for (int i = 0; i < books.length; i++) {
			books[i].show();
		}

		//find books by author Schildt
		System.out.println("Showing all books by Schildt");

		for (int i = 0; i < books.length; i++) {

			if (books[i].getAuthor().equals("Schildt")) {
				System.out.println(books[i].getTitle());
			}
		}

		SubBook ob = new SubBook();
	}
}