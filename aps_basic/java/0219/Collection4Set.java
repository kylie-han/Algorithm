import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Collection4Set {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("hi");set.add("hello");set.add("how are you");set.add("fine");set.add("thanks");
		System.out.println(set);
		HashSet<String> set2 = (HashSet<String>) set.clone();
		System.out.println(set2.contains("hello"));
		System.out.println(set2.isEmpty());
		Iterator<String> it = set2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}//while
	}

}
