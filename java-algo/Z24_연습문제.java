//0203_���� : ������, 1225 - SW�����ذ� �⺻ 7���� - ��ȣ������
public class Z24_�������� {
	public static int[] arr = new int[20];
	public static int front = -1;
	public static int rear = -1;
	public static void main(String[] args) {
		int candy = 20;
		int[] many = new int[10];
		
		//���� ����.
		
		for (int i = 0; i < many.length; i++) {
			many[1]++;
			enQueue(1);
			int x = deQueue();
			enQueue(x);
			enQueue(x + 1);
		}
		
		//�����鸦 �޴´�. -> �ٸ� ģ���� ���� ����.
		
	}
	private static int deQueue() {
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
