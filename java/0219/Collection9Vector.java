import java.util.Enumeration;
import java.util.Vector;

public class Collection9Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(2,3);//檬扁积己, 眠啊积己.
		v.add("hi");v.add("hello");
		System.out.println(v.size()+" : "+v.capacity());
		v.add("how are you");
		System.out.println(v.size()+" : "+v.capacity());
		v.add("fine");v.add("thanks");
		System.out.println(v.size()+" : "+v.capacity());
		v.add("thanks");
		System.out.println(v.size()+" : "+v.capacity());
		
		Enumeration<String> enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}//main

}
