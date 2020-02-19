import java.util.Arrays;

public class BookTest {
	public static Book[] books = new Book[100];
	public static int index = 0;
	
	public static void add(Book b) {
		books[index++] = b;
	}
	
	public static Book[] search() {
		Book[] book = new Book[index];
		for (int i = 0; i < index; i++) {
			book[i] = books[i];
		}
		return book;
	}
	public static Book searchIsbn(String isbn) {
		for (int i = 0; i < books.length; i++) {
			if(books[i].getIsbn().equals(isbn)) {
				return books[i];
			}
		}
		return null;
	}
	public static Book[] searchTitle(String title) {
		Book[] bookst = new Book[index];
		int cnt = 0;
		for (int i = 0; i < bookst.length; i++) {
			if(books[i].getTitle().contains(title)) {
				bookst[cnt++] = books[i];
			}
		}
		Book[] booksst = new Book[cnt];
		for (int i = 0; i < cnt; i++) {
			booksst[i] = bookst[i];
		}
		return booksst;
	}
	public static Book[] searchBook() {
		Book[] b = new Book[index];
		int cnt = 0;
		for (int i = 0; i < b.length; i++) {
			if(!(books[i] instanceof Magazine)) b[cnt++] = books[i]; 
		}
		Book[] bs = new Book[cnt];
		for (int i = 0; i < bs.length; i++) {
			bs[i] = b[i];
		}
		return bs;
	}
	private static Book[] searchMagazine() {
		Book[] m = new Magazine[index];
		int cnt = 0;
		for (int i = 0; i < m.length; i++) {
			if(books[i] instanceof Magazine) m[cnt++] = books[i]; 
		}
		Book[] ms = new Book[cnt];
		for (int i = 0; i < ms.length; i++) {
			ms[i] = m[i];
		}
		return ms;
		
	}
	private static Book[] searchPub(String publisher) {
		Book[] booksp = new Book[index];
		int cnt = 0;
		for (int i = 0; i < index; i++) {
			if(books[i].getPublisher().equals(publisher)) {
				booksp[cnt++] = books[i];
			}
		}
		Book[] bookssp = new Book[cnt];
		for (int i = 0; i < cnt; i++) {
			bookssp[i] = booksp[i];
		}
		return bookssp;
	}
	private static Book[] searchPrice(int price) {
		Book[] b = new Book[index];
		int cnt = 0;
		for (int i = 0; i < index; i++) {
			if(books[i].getPrice() <= price) {
				b[cnt++] = books[i];
			}
		}
		Book[] bs = new Book[cnt];
		for (int i = 0; i < cnt; i++) {
			bs[i] = b[i];
		}
		return bs;
	}
	private static int totalSum() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += books[i].getPrice();
		}
		return total;
	}
	private static int totalAvg() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += books[i].getPrice();
		}
		return total/index;
	}
	public static void main(String[] args) {
		Book b = new Book("isbn", "title", "author", "publisher", 12000, "desc");
		Book m1 = new Magazine("isbn1", "title", "author", "publisher", 10000, "desc", 2016, 8);
		add(b);
		add(m1);
		System.out.println(Arrays.toString(search()));
		System.out.println(searchIsbn("isbn1"));
		System.out.println(Arrays.toString(searchTitle("title")));
		System.out.println(Arrays.toString(searchBook()));
		System.out.println(Arrays.toString(searchMagazine()));
		System.out.println(Arrays.toString(searchPub("publisher")));
		System.out.println(Arrays.toString(searchPrice(11000)));
		System.out.println(totalSum());
		System.out.println(totalAvg());
//		System.out.println(Arrays.toString(books));
	}
}












