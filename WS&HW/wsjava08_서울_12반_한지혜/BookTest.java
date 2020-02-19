public class BookTest {

	public static void main(String[] args) {
		BookMgrImpl mgr = new BookMgrImpl();
		Book b = new Book("isbn", "title", "author", "publisher", 12000, "desc");
		Book m1 = new Magazine("isbn1", "title", "author", "publisher", 10000, "desc", 2016, 8);
		Book m2 = new Magazine("isbn2", "title1", "author1", "publisher1", 16000, "desc", 2020, 8);
		mgr.add(b);
		mgr.add(m1);
		mgr.add(m2);
		
		System.out.println(mgr.search());
		System.out.println(mgr.searchIsbn("isbn1"));
		System.out.println(mgr.searchTitle("title"));
		System.out.println(mgr.searchBook());
		System.out.println(mgr.searchMagazine());
		System.out.println(mgr.searchMagazineThisYear());
		System.out.println(mgr.searchPub("publisher"));
		System.out.println(mgr.searchPrice(11000));
		System.out.println(mgr.totalSum());
		System.out.println(mgr.totalAvg());
	}
}
