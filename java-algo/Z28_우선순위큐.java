import java.util.PriorityQueue;

/**
 * 
 * �켱���� ť
 * �� ������� ������ FIFO ������ �ƴϰ�, 
 * �켱������ ���� �����ͺ��� ������ ť
 * @author multicampus
 *
 */
public class Z28_�켱����ť {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		pq.offer(3);
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}
//����:abdhiejcfkglm
//����:hidbjeafkclgm
//����:hidjebkflmgca