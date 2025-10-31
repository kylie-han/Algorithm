import java.util.TreeMap;
//TreeMap : SortedMap을 구현. key를 가지고 정렬.
class TreeMapKey implements Comparable<TreeMapKey> {
	Integer keyNum;
	TreeMapKey(int i){ keyNum = i; }
	@Override
	public int compareTo(TreeMapKey o) {
		return this.keyNum.compareTo(o.keyNum);
	}
	@Override
	public String toString() {
		return ""+keyNum;
	}
}
class TreeMapValue {
	String valueStr;
	TreeMapValue(String s){ valueStr = s; }
	@Override
	public String toString() {
		return valueStr;
	}
}
public class Collection8TreeMap {

	public static void main(String[] args) {
		TreeMap<TreeMapKey, TreeMapValue> map3 = new TreeMap<TreeMapKey, TreeMapValue>();
		map3.put(new TreeMapKey(555), new TreeMapValue("fine"));
		map3.put(new TreeMapKey(777), new TreeMapValue("thanks"));
		map3.put(new TreeMapKey(333), new TreeMapValue("hi"));
		System.out.println(map3);

		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(4,"fine");map1.put(5,"thanks");map1.put(6,"hi");
		map1.put(1,"hi");map1.put(2,"hello");map1.put(3,"how are you");//put
		System.out.println(map1);
		TreeMap<String, Integer> map2 = new TreeMap<String, Integer>();
		map2.put("fine",5);map2.put("thanks",7);map2.put("hi",3);
		map2.put("hi",9);map2.put("hello",1);map2.put("how are you",4);//put
		System.out.println(map2);
	}

}
