import java.util.Arrays;
import java.util.Comparator;

class ComTest implements Comparable<ComTest> {
	Integer testNum;
	ComTest(int i){ testNum = i; }
	@Override
	public int compareTo(ComTest o) {
		return this.testNum.compareTo(o.testNum);
	}
	@Override
	public String toString() {
		return ""+testNum;
	}
}
class ComTest2 implements Comparator<ComTest> {
	@Override
	public int compare(ComTest o1, ComTest o2) {
		return o1.testNum.compareTo(o2.testNum) * -1;
	}
}
public class Inner5Anonym2 {

	public static void main(String[] args) {
		ComTest [] testArr = {new ComTest(555), new ComTest(111), new ComTest(333)};
		Arrays.sort(testArr);
		System.out.println(Arrays.toString(testArr));
//		Arrays.sort(testArr, new Comparator<ComTest>() {//34라인의 표현을 anonymous로 구현.
//			@Override
//			public int compare(ComTest o1, ComTest o2) {
//				return o1.testNum.compareTo(o2.testNum) * -1;
//			}
//		});//sort
		Arrays.sort(testArr, new ComTest2());
		System.out.println(Arrays.toString(testArr));
	}//main

}



