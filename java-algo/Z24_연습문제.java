//0203_과제 : 마이쭈, 1225 - SW문제해결 기본 7일차 - 암호생성기
public class Z24_연습문제 {
	public static int[] arr = new int[30];
	public static int front = -1;
	public static int rear = -1;

	public static void main(String[] args) {
		int candy = 20;
		int[] many = new int[10];
		int newPeople = 1;
		// 줄을 선다.
		enQueue(1);
//		System.out.println("1번이 줄을 선다.");
		while (candy > 0) {
			int x = deQueue();
			many[x]++;
			candy -= many[x];
//			System.out.println("  "+x+"번이 "+many[x]+"개의 마이쮸를 받는다.");
//			System.out.println("마이쮸"+candy+"개 남음");
			if (candy<=0) {
				 System.out.println("마지막 마이쮸는 "+ x + "가 가져감");
				 break;
			}
			enQueue(x);
//			System.out.println(x+"번이 다시 줄을 선다.");
			newPeople++;
			enQueue(newPeople);
//			System.out.println("새로 "+ newPeople + "번이 들어와 줄을 선다.");
		}

		// 마이쮸를 받는다. -> 다른 친구가 줄을 선다.

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
