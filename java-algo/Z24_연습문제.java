//0203_과제 : 마이쭈, 1225 - SW문제해결 기본 7일차 - 암호생성기
public class Z24_연습문제 {
	public static int[] arr = new int[20];
	public static int front = -1;
	public static int rear = -1;
	public static void main(String[] args) {
		int candy = 20;
		int[] many = new int[10];
		
		//줄을 선다.
		
		for (int i = 0; i < many.length; i++) {
			many[1]++;
			enQueue(1);
			int x = deQueue();
			enQueue(x);
			enQueue(x + 1);
		}
		
		//마이쮸를 받는다. -> 다른 친구가 줄을 선다.
		
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
