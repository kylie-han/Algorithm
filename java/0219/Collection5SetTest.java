import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Collection5SetTest {

	public static void main(String[] args) {
		Random rand = new Random();

		ArrayList<Integer> list = new ArrayList<Integer>();
		while(list.size() < 6) {
			int tmpNum = rand.nextInt(45)+1;//1~45.
			if(!list.contains(tmpNum)) {
				list.add(tmpNum);
			}
		}
		System.out.println(list);
		//1.HashSet에 1부터45까지의 수 중, 중복되지 않은 수 6개를 담으시오.
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size() < 6) {
			int tmpNum = rand.nextInt(45)+1;//1~45.
			set.add(tmpNum);
		}
		System.out.println(set);
		//2.Itrator를 이용하여 출력하시오.
		Iterator<Integer> it = set.iterator();
		System.out.print("[");
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		System.out.print("]");
	}//main

}






