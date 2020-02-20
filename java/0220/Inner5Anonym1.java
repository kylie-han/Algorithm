import java.util.Arrays;
import java.util.Comparator;

class ComTest3 implements Comparable<ComTest3> {
	Integer test;
	ComTest3(int i){ test = i; }
	@Override
	public int compareTo(ComTest3 o) {
		return this.test.compareTo(o.test);
	}
	@Override
	public String toString() {
		return ""+test;
	}
}
public class Inner5Anonym1 {

	public static void main(String[] args) {
		ComTest3 [] test = {new ComTest3(555), new ComTest3(111), new ComTest3(333)};
		Arrays.sort(test);
		System.out.println(Arrays.toString(test));
		Arrays.sort(test, new Comparator<ComTest3>() {
			@Override
			public int compare(ComTest3 o1, ComTest3 o2) {
				return o2.test.compareTo(o1.test);
			}
		});
		System.out.println(Arrays.toString(test));
	}

}
