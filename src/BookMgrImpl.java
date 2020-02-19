import java.util.ArrayList;

public class BookMgrImpl implements IBookMgr {
	ArrayList<Book> list = new ArrayList<>();
//	public static Book[] books = new Book[100];
//	public static int index = 0;

	public void add(Book b) {
//		books[index++] = b;
		list.add(b);
	}

	public ArrayList<Book> search() {
//		Book[] book = new Book[index];
//		for (int i = 0; i < index; i++) {
//			book[i] = books[i];
//		}
		return list;
	}
//	public Book searchIsbn(String isbn) {
//		for (int i = 0; i < books.length; i++) {
//			if(books[i].getIsbn().equals(isbn)) {
//				return books[i];
//			}
//		}
//		return null;
//	}
//	public Book[] searchTitle(String title) {
//		Book[] bookst = new Book[index];
//		int cnt = 0;
//		for (int i = 0; i < bookst.length; i++) {
//			if(books[i].getTitle().contains(title)) {
//				bookst[cnt++] = books[i];
//			}
//		}
//		Book[] booksst = new Book[cnt];
//		for (int i = 0; i < cnt; i++) {
//			booksst[i] = bookst[i];
//		}
//		return booksst;
//	}
//	public Book[] searchBook() {
//		Book[] b = new Book[index];
//		int cnt = 0;
//		for (int i = 0; i < b.length; i++) {
//			if(!(books[i] instanceof Magazine)) b[cnt++] = books[i]; 
//		}
//		Book[] bs = new Book[cnt];
//		for (int i = 0; i < bs.length; i++) {
//			bs[i] = b[i];
//		}
//		return bs;
//	}
//	public Book[] searchMagazine() {
//		Book[] m = new Magazine[index];
//		int cnt = 0;
//		for (int i = 0; i < m.length; i++) {
//			if(books[i] instanceof Magazine) m[cnt++] = books[i]; 
//		}
//		Book[] ms = new Book[cnt];
//		for (int i = 0; i < ms.length; i++) {
//			ms[i] = m[i];
//		}
//		return ms;
//		
//	}
//	public Book[] searchPub(String publisher) {
//		Book[] booksp = new Book[index];
//		int cnt = 0;
//		for (int i = 0; i < index; i++) {
//			if(books[i].getPublisher().equals(publisher)) {
//				booksp[cnt++] = books[i];
//			}
//		}
//		Book[] bookssp = new Book[cnt];
//		for (int i = 0; i < cnt; i++) {
//			bookssp[i] = booksp[i];
//		}
//		return bookssp;
//	}
//	public Book[] searchPrice(int price) {
//		Book[] b = new Book[index];
//		int cnt = 0;
//		for (int i = 0; i < index; i++) {
//			if(books[i].getPrice() <= price) {
//				b[cnt++] = books[i];
//			}
//		}
//		Book[] bs = new Book[cnt];
//		for (int i = 0; i < cnt; i++) {
//			bs[i] = b[i];
//		}
//		return bs;
//	}
//	public int totalSum() {
//		int total = 0;
//		for (int i = 0; i < index; i++) {
//			total += books[i].getPrice();
//		}
//		return total;
//	}
//	public int totalAvg() {
//		int total = 0;
//		for (int i = 0; i < index; i++) {
//			total += books[i].getPrice();
//		}
//		return total/index;
//	}
}
