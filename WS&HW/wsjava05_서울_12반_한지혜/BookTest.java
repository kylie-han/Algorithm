
public class BookTest {
	public static void main(String[] args) {
		Book javaPro = new Book();
		javaPro.isbn = "21424";
		javaPro.title = "Java Pro";
		javaPro.author = "김하나";
		javaPro.publisher = "Jaen.kr";
		javaPro.price = 15000;
		javaPro.desc = "Java 기본문법";
		
		Book b = new Book();
		b.isbn = "35355";      
		b.title = "분석 설계";  
		b.author = "소나무";      
		b.publisher = "Jaen.kr";
		b.price = 30000;       
		b.desc = "SW 모델링";  
		
		Magazine jw = new Magazine();

		jw.isbn = "355354";
		jw.title = "Java World";
		jw.author = "편집부";
		jw.publisher = "Java.com";
		jw.price = 7000;
		jw.desc = "첫걸음";
		jw.year = 2018;
		jw.month = 2;
		
		System.out.println("*********************** 도서 목록 **************************");
		System.out.println(javaPro.toString());
		System.out.println(b.toString());
		System.out.println(jw.toString());
	}
}
