import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Collection5SetTest {
	public static void main(String[] args) {
		//1. HashSet에  1부터 45까지 수 중 중복되지 않은 수 6개를 담으시오.
		Random rd = new Random();
		HashSet<Integer> list = new HashSet<Integer>();
		while(list.size() <6) {
			int tempNum = rd.nextInt(45)+1;
			list.add(tempNum);
			System.out.println(tempNum);
		}
		System.out.println(list);
		//2. Iterator를 이용하여 출력하시오.
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}//end of main
}//end of class
