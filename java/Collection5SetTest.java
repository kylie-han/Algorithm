import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Collection5SetTest {
	public static void main(String[] args) {
		//1. HashSet��  1���� 45���� �� �� �ߺ����� ���� �� 6���� �����ÿ�.
		Random rd = new Random();
		HashSet<Integer> list = new HashSet<Integer>();
		while(list.size() <6) {
			int tempNum = rd.nextInt(45)+1;
			list.add(tempNum);
			System.out.println(tempNum);
		}
		System.out.println(list);
		//2. Iterator�� �̿��Ͽ� ����Ͻÿ�.
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}//end of main
}//end of class
