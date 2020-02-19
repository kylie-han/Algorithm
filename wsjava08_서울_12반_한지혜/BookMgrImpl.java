import java.util.ArrayList;
import java.util.Calendar;

public class BookMgrImpl implements IBookMgr {
	ArrayList<Book> list = new ArrayList<>();

	public void add(Book b) {
		list.add(b);
	}

	public ArrayList<Book> search() {
		return list;
	}

	public Book searchIsbn(String isbn) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getIsbn().equals(isbn)) {
				return list.get(i);
			}
		}
		return null;
	}

	public ArrayList<Book> searchTitle(String title) {
		ArrayList<Book> st = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				st.add(list.get(i));
			}
		}
		return st;
	}

	public ArrayList<Book> searchBook() {
		ArrayList<Book> sb = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (!(list.get(i) instanceof Magazine)) {
				sb.add(list.get(i));
			}
		}
		return sb;
	}

	public ArrayList<Book> searchMagazine() {
		ArrayList<Book> sm = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Magazine) {
				sm.add(list.get(i));
			}
		}
		return sm;
	}
	public ArrayList<Book> searchMagazineThisYear() {
		Calendar Now = Calendar.getInstance();
		ArrayList<Book> smy = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Magazine) {
				Magazine m = (Magazine)list.get(i);
				if (m.getYear() == Now.get(Calendar.YEAR)) {
					smy.add(list.get(i));
				}
			}
		}
		return smy;
	}

	public ArrayList<Book> searchPub(String publisher) {
		ArrayList<Book> sp = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPublisher().equals(publisher)) {
				sp.add(list.get(i));
			}
		}
		return sp;
	}

	public ArrayList<Book> searchPrice(int price) {
		ArrayList<Book> spr = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPrice() <= price) {
				spr.add(list.get(i));
			}
		}
		return spr;
	}

	public int totalSum() {
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i).getPrice();
		}
		return total;
	}

	public int totalAvg() {
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i).getPrice();
		}
		return total / list.size();
	}
}
