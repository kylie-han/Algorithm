// data type casting �� ��ȯ
// promotion : ���� data type -> ū data type
// demotion : ū data type -> ���� data type
public class Var2 {
	public static void main(String[] args) {
		short s = 123;
		int i = s;	//������ data type casting, �ڵ�
		short s2 = (short) i; //����� data type casting, ����
		// �������� �⺻�� int
		long l1 = 123456L;
		byte b1 = 7, b2 = 8;
		// byte b3 = b1 + b2;//���� �������� int ��ȯ
		byte b3 = (byte)(b1 + b2);
		//���ۿ�
		int i2 = 300;
		byte b4 = (byte)i2;
		System.out.println(b4);
		//ascii code casting
		char ch = 65;
		System.out.println(ch);
		int i3 = ch;
		System.out.println(i3);
	}

}
