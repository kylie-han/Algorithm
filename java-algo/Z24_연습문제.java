//0203_���� : ������, 1225 - SW�����ذ� �⺻ 7���� - ��ȣ������
public class Z24_�������� {
	public static int[] arr = new int[30];
	public static int front = -1;
	public static int rear = -1;

	public static void main(String[] args) {
		int candy = 20;
		int[] many = new int[10];
		int newPeople = 1;
		// ���� ����.
		enQueue(1);
//		System.out.println("1���� ���� ����.");
		while (candy > 0) {
			int x = deQueue();
			many[x]++;
			candy -= many[x];
//			System.out.println("  "+x+"���� "+many[x]+"���� �����鸦 �޴´�.");
//			System.out.println("������"+candy+"�� ����");
			if (candy<=0) {
				 System.out.println("������ ������� "+ x + "�� ������");
				 break;
			}
			enQueue(x);
//			System.out.println(x+"���� �ٽ� ���� ����.");
			newPeople++;
			enQueue(newPeople);
//			System.out.println("���� "+ newPeople + "���� ���� ���� ����.");
		}

		// �����鸦 �޴´�. -> �ٸ� ģ���� ���� ����.

	}

	public static int deQueue() {
		// TODO Auto-generated method stub
		front++;
		return arr[front];
	}

	public static void enQueue(int data) {
		// TODO Auto-generated method stub
		rear++;
		arr[rear] = data;
	}
}
