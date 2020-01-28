/**
 * String
 * StringBuilder	���Ͼ������
 * StringBuffer		��Ƽ�������
 * @author multicampus
 *
 */
public class Z12_StringBuilder {
	public static void main(String[] args) {
		String str = "hello";
//		str += "a";
		str = str.concat("a");//�����Ϸ��� ���Ҵ� �������.
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder("hello");//����� 16ĭ �� ���������.
		sb.append("a");//�ڿ� a�� �ٿ��ش�.
//		sb.delete(start, end)
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);//������ ����� �����
		
		String s = "hello";
		// String => StringBuilder�� �����ϱ�	
		StringBuilder ssbb = new StringBuilder(s);
		ssbb.reverse();//��������
		s = ssbb.toString(); //StringBuilder => String �� �����ϱ�
		System.out.println(s);
		
		s = "hello";
		System.out.println(new StringBuilder(s).reverse().toString());
		
	}//end of main
}//end of class
