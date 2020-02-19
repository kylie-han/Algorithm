
public class Book {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;
	public String toString() {
		String str = isbn + "\t| " + title + "\t|" + author + "\t|" 
				+ publisher + "\t|" + price + "\t|" + desc;
		return str;
		
	}
}
