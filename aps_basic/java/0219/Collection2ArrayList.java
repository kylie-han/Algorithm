import java.util.ArrayList;

/*
 * ArrayList : array -> ArrayList -> LinkedList (array�� LinkedList�� �߰� ����)
 * ArrayList�� LinkedList ����, data �߰� ������ ����� ũ��.
 * - index ����.
 * - size() : ���� ����.
 */
public class Collection2ArrayList {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(new Double(3.14));
		list1.add(new String("hello"));//add
		Object o = list1.get(0);//get
		if(o instanceof Double) {
			Double d = (Double) o;
		}
		ArrayList<Double> list2 = new ArrayList<Double>();
		list2.add(new Double(3.14));
		//list2.add(new String("hello"));//error - list2�� Double ���� �������� Data Type�� ������.
		Double d2 = list2.get(0);//Data Type ���� -> instanceof, casting �ʿ� ����.
//		for(int i=0; i<list1.size(); i++){
//			System.out.println(list1.get(i));//get�� ���� index ���� ����.
//		}
//		for(Object o2 : list1) {
//			System.out.println(o2);
//		}
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("hi");list3.add("hello");list3.add("how are you");list3.add("fine");list3.add("thanks");
		ArrayList<String> list4 = (ArrayList<String>) list3.clone();
		list4.add(4, "and you?");//index
		list4.remove(4);
		list4.remove("hi");
		list4.add(0, "hi");
		list4.add(4, "bye ~~~");
		list4.add("bye ~~~");
		System.out.println(list4);
		System.out.println(list4.indexOf("bye ~~~"));
		System.out.println(list4.lastIndexOf("bye ~~~"));
		System.out.println(list4.isEmpty());
		list4.clear();
		System.out.println(list4.isEmpty());
		Object [] oarr = list3.toArray();
		for(Object o3 : oarr) {
			System.out.println(o3);
		}
		System.out.println(list3.contains("hi"));
	}//main

}











