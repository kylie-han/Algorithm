
public class Magazine {
	String isbn;
	String title;
	String author;
	String publisher;
	int year;
	int month;
	int price;
	String desc;
	public String toString() {
		String str = isbn + "/t| " + title + "\t| " + 
				author + "\t| " + publisher + "\t| " + price + "\t| " + desc 
				+ "\t| " + year + "." + month;
		return str;
		
	}
}
