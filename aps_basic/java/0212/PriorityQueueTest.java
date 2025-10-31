import java.util.PriorityQueue;
import java.util.Queue;

class IntClass implements Comparable<IntClass>
{
	int a, b, c;
	IntClass(int no1, int no2, int no3){
		a=no1;
		b=no2;
		c=no3;
	}
	@Override
	public int compareTo(IntClass o) {
		if(this.a > o.a) {
			return 1;
		} else if(this.a < o.a) {
			return -1;
		} else {
			return 0;
		}
	}
}
public class PriorityQueueTest {
	public static void main(String[] args) {
		IntClass ic3= new IntClass(7, 8, 9);
		IntClass ic1 = new IntClass(1, 2, 3);
		IntClass ic2 = new IntClass(4, 5, 6);
		Queue<IntClass> qu = new PriorityQueue<IntClass>();
		qu.offer(ic3);
		qu.offer(ic1);
		qu.offer(ic2);
		while(qu.peek() != null) {
			IntClass tmp = (IntClass)qu.poll();
			System.out.println(tmp.a);
		}
	}
}
