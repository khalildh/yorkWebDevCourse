package bookpack;

public class Book {
	protected String title;
	protected String author;
	protected int pubDate;

	public Book(String t, String a, int p) {
		title = t;
		author = a;
		pubDate = p;
	}

	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
	}

	public void setTitle(String x) {
		title = x;
	}

	public void setAuthor(String x) {
		author = x;
	}

	public void setPubDate(int x) {
		pubDate = x;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPubDate() {
		return pubDate;
	}


}