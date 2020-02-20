import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 * Collection Application Programming Interface : 저장 구조에 관련된 작업을 할 수 있는 자료 제공의 의미.
 * Collection Framework : 저장 구조에 관련된 작업을 할 수 있는 바탕을 제공한다는 뜻.
 * - Data Structure를 구현해 놓은 Library.
 * - java.util 패키지.
 * - 개발 소요 시간 단축 + 최적 알고리즘 제공.
 * Set : 순서(index) 없음, 데이터 중복 불가. HashSet, TreeSet.
 * List : 순서(index가 key역할) 있음, 데이터 중복 가능. ArrayList, Vector, LinkedList.
 * Map : 저장 data를 <key-value> 쌍으로 관리. 순서(index) 없음. key중복 불가. value 중복 가능. HashMap, TreeMap.
 */
public class Collection1OverView {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("hello");
		set.add(1);
		set.add(3.14);
		set.add(1);//중복 없음.
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




