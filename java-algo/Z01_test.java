
public class Z01_test {
//	���ϸ�� Ŭ�������� ������ �� Ŭ������ public�� �� �� �ִ�.
	public static void main(String[] args) {
//		������ �����ϸ� ���θ޼��带 ������		
//		ctrl+spacebar
		System.out.println(123);	//ȭ��(�ܼ�â)�� ������ִ� �޼���
//		������ Run(ctrl+F11)
//		�����ϸ� ���� �̸��� .class ������ ����� �� ������ ������.
		
		for (int i = 2; i <= 9 ; i++) {
			for (int j = 1; j <= 9 ; j++) {
				System.out.println(i+"*"+j+"="+i*j);
				System.out.printf("%d*%d=%d\n",i,j,i*j);
			}
		}
	}//end of main

}
