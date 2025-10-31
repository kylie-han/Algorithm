package chap4.base;
/**
 * <pre>
 * ȸ�� ������ ����� ������ class
 * </pre>
 * 
 * @author rojaiho
 * @version 5.1.2
 * @see java.lang.String
 */
public class Movie {
	/** ���� �����͸� �����ϴ� ���� */
	String title;
	/** ���� �����͸� �����ϴ� ���� */
	String director;
	/** �帣 �����͸� �����ϴ� ���� */
	String genre;
	/** �ٰŸ� �����͸� �����ϴ� ���� */
	String summary;
	/** ��� �����͸� �����ϴ� ���� */
	int grade;
	/** ��ü�� ������ �ִ� ������ ����ϴ� �޼ҵ� */
	public void movieInfo() {
		System.out.println("���� : "+title+"\t"
				+"���� : "+director+"\t"
				+"�帣 : "+genre+"\t"
				+"��� : "+summary+"\t"
				+"�ٰŸ� : "+grade);
	}
	/** ��ü�� ������ �ִ� ������ ��ȯ�ϴ� �޼ҵ� */
	public String toString() {
		String str = "���� : "+title+"\t"
				+"���� : "+director+"\t"
				+"�帣 : "+genre+"\t"
				+"��� : "+summary+"\t"
				+"�ٰŸ� : "+grade;
		return str;
	}
}
