import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 * Collection Application Programming Interface : ���� ������ ���õ� �۾��� �� �� �ִ� �ڷ� ������ �ǹ�.
 * Collection Framework : ���� ������ ���õ� �۾��� �� �� �ִ� ������ �����Ѵٴ� ��.
 * - Data Structure�� ������ ���� Library.
 * - java.util ��Ű��.
 * - ���� �ҿ� �ð� ���� + ���� �˰��� ����.
 * Set : ����(index) ����, ������ �ߺ� �Ұ�. HashSet, TreeSet.
 * List : ����(index�� key����) ����, ������ �ߺ� ����. ArrayList, Vector, LinkedList.
 * Map : ���� data�� <key-value> ������ ����. ����(index) ����. key�ߺ� �Ұ�. value �ߺ� ����. HashMap, TreeMap.
 */
public class Collection1OverView {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("hello");
		set.add(1);
		set.add(3.14);
		set.add(1);//�ߺ� ����.
		set.add(3.14);
		System.out.println("set : " + set);
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(1);
		list.add(3.14);
		list.add(1);
		list.add(3.14);
		System.out.println("list : " + list);
		HashMap map = new HashMap();
		map.put(1, "you");
		map.put(2, "kang");
		map.put(3, "haha");
		map.put(4, "haha");
		map.put(5, "haha");
		System.out.println("map : " + map);
	}

}




