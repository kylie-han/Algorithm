import java.util.ArrayList;

/*
 * ArrayList : array -> ArrayList -> LinkedList (array와 LinkedList의 중간 개념)
 * ArrayList는 LinkedList 보다, data 추가 삭제에 비용이 크다.
 * - index 개념.
 * - size() : 길이 개념.
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
		//list2.add(new String("hello"));//error - list2는 Double 저장 전용으로 Data Type을 제한함.
		Double d2 = list2.get(0);//Data Type 제한 -> instanceof, casting 필요 없음.
//		for(int i=0; i<list1.size(); i++){
//			System.out.println(list1.get(i));//get을 통한 index 접근 가능.
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











