//���� �ּ�		//���� ������
/*
 * ������ �ּ�, �κ� �ּ�
 */
/**
 * �����ּ�
 *	Ŭ����, �޼���. ������ ����ξտ� �ۼ��ؼ� �ΰ����� ������ ��
 */



public class Z02_if_for {
	public static void main(String[] args) {
//		����(�޸� ũ�Ⱑ ������), ������(�⺻���� �ƴ� Ÿ��)
//		�⺻�� Ÿ�� ���� : 8����
//		������ 	byte(1), short(2,c������ ȣȯ��), "int"(4,�������), long(8,������� �ֹι�ȣ)
//		�Ǽ���	float(4), "double"(8)
//		������	char(2)
//		����	boolean(1)
		
		byte a; //��������
		a = 3;	//�ʱ�ȭ : ó�� ���� �Ҵ�
		short b = 3;	//��������� �ʱ�ȭ�� �ѹ���
		int c = 4;
		long d = 5L;	//���ͷ� ���̻� L or l
		
		float e = 3.14f;	//���ͷ� ���̻� F or f
		double g = 3.14;	//���ͷ� ���̻� D or d or ��������
		
		char h = '��';	//�ѱ��ڸ� ǥ������-�����ڵ� � ���ڵ� ����
		
		boolean i = true;	//���� true/false
		i = false; //�������� ������ ���� ����Ѵ�.
		System.out.println(i);	//������ ���� ��µȴ�. 
		// ���� �ҽ��ڵ带 �� �м��ؾ� �Ѵ�*
		String s = "�ȳ��ϼ���";	//���ڿ��� ������ �迭
		String ss = new String("�ȳ��ϼ���");
		
//		���ڿ� ��������
		s = "�ȳ�" + "�ϼ���";	//���ڿ� ����
		s = "�ȳ�" + 3;	//���ڿ� ,���ڿ� ����
		
		System.out.println(s);
		System.out.println(3 + 4 + "�ȳ�" + 3 + 4);	//�����ڴ� �⺻������ �� ���ڸ� ���,
		
		int t = 5;
		String sss = "" + t;	//���ڿ��� ���ڿ��� ��ȯ
		
		System.out.println(t);
		
		/////////////////////////////////////////////////
//		�ڹ��� ���ǹ� : if~else, switch~case, ���׿�����
//		if(���ǽ�) {	//���ǽ��� true/false boolean Ÿ���� ����� �־�� �Ѵ�.
//			������ ���� ��� ����			
//		} else if(���ǽ�2){
//			���ǽ�2�� ���ΰ�� ����		
//		} else{
//			���ǽ��� ������ ��� ����
//		}
//		
//		swap ���� ��ȯ
		int x = 5;
		int y = 7;
		
//		int temp;
//		temp = x;
//		x = y;
//		y = temp;
		
		x = x+y;	//x = 12, y = 7
		y = x-y;	//12, 5
		x = x-y;	//7, 5
		
		System.out.println(x+", "+y); //7, 5
		
		x = 8;
		if (x%2 == 0 ) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		
		int n = -3;
		int m = -7;
		int v = -5;
		
//		int z = 0;	//�ʱⰪ �߿�
//		if(n>m) {
//			z = n;
//			if(z>v) {
//				System.out.println(z);
//			}else {
//				System.out.println(v);
//			}
//		}else {
//			z = m;
//			if(z>v) {
//				System.out.println(z);
//			}else {
//				System.out.println(v);
//			}
//		}
		
		int max = Integer.MIN_VALUE;
//		int max = -100;	//�ʱⰪ �߿�
		//�� ������ ���� ���� ������ �ʱ�ȭ
		//���� ������ ���� ���� ������ �ʱ�ȭ
		if (max<n) max = n;
		if (max<m) max = m;
		if (max<v) max = v;
		
//		�ڹ��� �ݺ��� : for, while, do~while
//		for (�ʱ��;���ǽ�;������){
		for(int j = 0; j < 5; j++) {
			System.out.println(j);
		}
		
		
		
	}// end of main

}// end of class
