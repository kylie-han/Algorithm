import java.util.Arrays;

/**
 * ���ڿ�
 * @author multicampus
 *
 */
public class Z11_String {
	public static void main(String[] args) {
//		String		1234567890
		String s = "abcDefGHij";
//		System.out.println(s);
		p(s);
		p(s.length()+" : ���ڿ��� ����");
		p(s.concat("xyz")+ " : ���ڿ� �̾�ٿ���");
		p(s.replace("def","xxxxxxxx")+ " : ���ڿ� ����");
		p(s.replace("def", ""));
		p(s.substring(5)+" : 5������ ������(5�� ����)");
		p(s.substring(5,8)+" : 5~7����(������ ����, �������� ������)");
		p(s.toLowerCase()+" : ��� �ҹ��ڷ� ����");
		p(s.toUpperCase()+ " : ��� �빮�ڷ� ����");
		p(s.equals("abcDefGHij") + " : ������ Ȯ��");	//���������� ������ �񱳽� ==�ϸ� �ȵȴ�.
		p(s.equals("abcdefghij") + " : ������ Ȯ��");	
		p(s.equalsIgnoreCase("abcdefghij") + " : ������ Ȯ��");
		p("    a   b  cde  ".trim()+ "���ڿ� �� ���� ȭ��Ʈ�����̽��� ����"	);	//����, ��, �ٹٲ�	(�յڸ� ����)
		p(s.indexOf("b")+" : b ������ index");
		
		p(s.charAt(3) + " : 3��° �ε��� ���� ����");
		
		String s2 = "abcDefGHij";
		for (int i = 0; i < s2.length(); i++) {
			System.out.print(s2.charAt(i)+" ");
		}
		System.out.println();
		char[] crr = s2.toCharArray();
		System.out.println(Arrays.toString(crr));
		for (int i = 0; i < crr.length; i++) {
			System.out.print(crr[i] + " ");
		}
		System.out.println();
		
		String str = "ȣ����,����,�⸰,�䳢,�ٶ���";
		String[] srr = str.split(",");//���ڿ� �ɰ���, ����ȭ ǥ������ ����
		System.out.println(Arrays.toString(srr));
		
		String ss1 = "hello";//�⺻�� Ÿ�� �����ϴ� ��ó�� ����(����)
		String ss2 = "hello";// ��Ȱ���ϹǷ� �޸� ����, �ð� ����
		String ss3 = new String("hello");//Ŭ���� ��ü ����
		String ss4 = new String("hello");
		
		System.out.println(ss1 == ss2);//true �ּҺ�
		System.out.println(ss3 == ss4);//false �ּҺ�
		System.out.println(ss1.equals(ss3));//true ���빰 ��
		
		String ss5 = ss1.toUpperCase().toLowerCase().replace("ll", "LL");//������ �״�� �ִ�,�۾��� ������ �������ش�.
		System.out.println(ss1);
		System.out.println(ss5);
		
		/////////�������� (olleh)���///////////////
		String ss6 = "hello";
		char[] crr1 = ss6.toCharArray();
		char[] olleh = new char[5];
		for (int i = crr1.length-1; i >= 0; i--) {
			olleh[crr1.length-1-i] = crr1[i];		
		}
		System.out.println(Arrays.toString(olleh));
		/////////////////////////////////////////////
		for (int i = 0; i < crr1.length; i++) {
			System.out.print(ss6.charAt(ss6.length()-1-i));
		}System.out.println();
		for (int i = ss6.length()-1; i >= 0; i--) {
			System.out.print(ss6.charAt(i));
		}System.out.println();
		String z = "";
		for (int i = 0; i < ss6.length(); i++) {
			z = ss6.charAt(i) + z;
		}System.out.println(z);
		/////////////////////////////////////////////
		
	}//end of main
	public static void p(String str) {
		System.out.println(str);
	}
}//end of class
