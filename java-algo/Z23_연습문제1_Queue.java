import java.util.Arrays;
import java.util.LinkedList;

public class Z23_연습문제1_Queue {
	public static int[] arr = new int[20];
	public static int front = -1;
	public static int rear = -1;
	public static void main(String[] args) {
		int[] data = {1,2,3,};
//		createQueue();
		for (int i = 0; i < data.length; i++) {
			enQueue(data[i]);
		}
		for (int i = 0; i < data.length; i++) {
			deQueue();
		}
	}//end of main

	public static void createQueue() {
		// TODO Auto-generated method stub
		
	}

	private static void deQueue() {
		// TODO Auto-generated method stub
		front++;
		System.out.print(arr[front] + " ");
	}

	public static void enQueue(int data) {
		// TODO Auto-generated method stub
		rear++;
		arr[rear] = data;
	}
}//end of class
