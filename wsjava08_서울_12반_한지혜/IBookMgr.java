import java.util.ArrayList;

public interface IBookMgr {
	public static int index = 0;
	
	public abstract void add(Book b);
	public abstract ArrayList<Book> search();
	public abstract Book searchIsbn(String isbn);
	public abstract ArrayList<Book> searchTitle(String title);
	public abstract ArrayList<Book> searchBook();
	abstract ArrayList<Book> searchMagazine();
	abstract ArrayList<Book> searchMagazineThisYear();
	abstract ArrayList<Book> searchPub(String publisher);
	abstract ArrayList<Book> searchPrice(int price);
	abstract int totalSum();
	abstract int totalAvg();
}
