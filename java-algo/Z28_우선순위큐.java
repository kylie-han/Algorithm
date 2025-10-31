import java.util.PriorityQueue;

/**
 * 
 * 우선순위 큐
 * 들어간 순서대로 나오는 FIFO 구조가 아니고, 
 * 우선순위가 높은 데이터부터 나오는 큐
 * @author multicampus
 *
 */
public class Z28_우선순위큐 {
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
//전위:abdhiejcfkglm
//중위:hidbjeafkclgm
//후위:hidjebkflmgca