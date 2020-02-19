import java.util.Arrays;

public class BookTest {
	
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












