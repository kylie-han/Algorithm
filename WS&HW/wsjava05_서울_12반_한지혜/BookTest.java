
public class BookTest {
	public static void main(String[] args) {
		Book javaPro = new Book();
		javaPro.isbn = "21424";
		javaPro.title = "Java Pro";
		javaPro.author = "���ϳ�";
		javaPro.publisher = "Jaen.kr";
		javaPro.price = 15000;
		javaPro.desc = "Java �⺻����";
		
		Book b = new Book();
		b.isbn = "35355";      
		b.title = "�м� ����";  
		b.author = "�ҳ���";      
		b.publisher = "Jaen.kr";
		b.price = 30000;       
		b.desc = "SW �𵨸�";  
		
		Magazine jw = new Magazine();

		jw.isbn = "355354";
		jw.title = "Java World";
		jw.author = "������";
		jw.publisher = "Java.com";
		jw.price = 7000;
		jw.desc = "ù����";
		jw.year = 2018;
		jw.month = 2;
		
		System.out.println("*********************** ���� ��� **************************");
		System.out.println(javaPro.toString());
		System.out.println(b.toString());
		System.out.println(jw.toString());
	}
}
