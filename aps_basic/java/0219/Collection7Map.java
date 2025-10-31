import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Collection7Map {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"hi");map.put(2,"hello");map.put(3,"how are you");//put
		map.put(4,"fine");map.put(5,"thanks");map.put(6,"hi");
		System.out.println(map);
		////////////////////////////////////////
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int keyInt = it.next();
			System.out.println(map.get(keyInt));//get
		}
		////////////////////////////////////////
		System.out.println(map.containsKey(999));
		System.out.println(map.containsValue("hi"));
	}//main

}
