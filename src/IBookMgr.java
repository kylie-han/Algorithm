import java.util.ArrayList;

public interface IBookMgr {
	public static int index = 0;
	
	public abstract void add(Book b);
	public abstract ArrayList<Book> search();
//	public abstract Book searchIsbn(String isbn);
//	public abstract Book[] searchTitle(String title);
//	public abstract Book[] searchBook();
//	abstract Book[] searchMagazine();
//	abstract Book[] searchPub(String publisher);
//	abstract Book[] searchPrice(int price);
//	abstract int totalSum();
//	abstract int totalAvg();
}
