/**
 * 
 * @author multicampus
 *
 */
public class Z09_��Ʈ���� {
	public static void main(String[] args) {
		int a = 15;
		System.out.println(a);//10������ ���
		System.out.println(Integer.toBinaryString(a));//���̳ʸ��� ���
		System.out.println(Integer.toString(a, 10));// ������ �������� ���
		
		int b = 9;
		int c = 13;
		System.out.println(Integer.toBinaryString(b)+" b");//���̳ʸ��� ���
		System.out.println(Integer.toBinaryString(c)+" c");//���̳ʸ��� ���
		System.out.println(Integer.toBinaryString(b&c)+" b&c");//���̳ʸ��� ���
		System.out.println(Integer.toBinaryString(b|c)+" b|c");//���̳ʸ��� ���

		System.out.println(Integer.toBinaryString(1<<0)+" 1<<0");//2^0
		System.out.println(Integer.toBinaryString(1<<1)+" 1<<1");//2^1
		System.out.println(Integer.toBinaryString(1<<2)+" 1<<2");//2^2
		System.out.println(Integer.toBinaryString(1<<3)+" 1<<3");//2^3
		//	<<	����Ʈ ������ *2�� ȿ���̴�.
		//	>>	����Ʈ ������ /2�� ȿ���̴�.
		
//		��Ʈ ����ŷ : ���ϴ� ��Ʈ�� ���� �̾Ƴ��� 
		int n = 0b100110111; //2����
//		int n = 017; //15/8����
//		int n = 0xF; //15/16����

//		System.out.println(Integer.toBinaryString(n & 0b1<<5));
		
		System.out.println((n & 0b1<<0) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<1) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<2) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<3) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<4) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<5) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<6) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<8) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<7) == 0 ? 0 : 1);
		
		System.out.println("�ݺ������� ��Ʈ�� ����ϱ�(����Ʈ ������ Ȱ��)");
		for (int i = 0; i < 9; i++) {
			System.out.println((n & 1<<i) == 0 ? 0 : 1);
		}
	}
}
