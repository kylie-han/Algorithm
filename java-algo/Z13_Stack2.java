/**
 * ���ñ���
 * @author multicampus
 *
 */
public class Z13_Stack2 {
	public static int[] s = new int [3];
	public static int top = -1;	//���� �������� �Էµ� ������� ������ ��ġ�� ����ų �ε���
	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
	}//end of main
	public static void push(int data) {
		// TODO Auto-generated method stub
		top++;	//�ε��� ���� �ø�
		if(top >= s.length) {
			System.out.println("overflow error");
			return;
		}else {
		s[top] = data;
		}
	}
	
}//end of class
