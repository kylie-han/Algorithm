import java.util.TreeSet;
//TreeSet : SortedSetÀ» ±¸Çö.
class TreeSetObject implements Comparable<TreeSetObject> {
	Integer tsNum;
	TreeSetObject(int i){ tsNum = i; }
	@Override
	public int compareTo(TreeSetObject o) {
		return this.tsNum - o.tsNum;
	}
	@Override
	public String toString() {
		return ""+tsNum;
	}
}
public class Collection6TreeSet {
	public static void main(String[] args) {
		TreeSet<TreeSetObject> ts3 = new TreeSet<TreeSetObject>();
		ts3.add(new TreeSetObject(555));ts3.add(new TreeSetObject(111));ts3.add(new TreeSetObject(777));
		System.out.println(ts3);
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(555);ts1.add(111);ts1.add(777);ts1.add(333);ts1.add(999);
		System.out.println(ts1);
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("hi");ts2.add("hello");ts2.add("how are you");ts2.add("fine");ts2.add("thanks");
		System.out.println(ts2);
	}//main

}
