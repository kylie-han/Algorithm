import java.util.Arrays;

class TestResult implements Comparable<TestResult> {
	String subject;
	int jumsu;
	public TestResult(String s, int i) {
		subject = s;
		jumsu = i;
	}
	@Override
	public String toString() {
		return "["+subject+" : "+jumsu+"]";
	}
	@Override
	public int compareTo(TestResult o) {
		if(this.jumsu > o.jumsu) {
			return 1;//자리 바꿈 : 뒤로 이동
		} else if(this.jumsu < o.jumsu) {
			return -1;//자리 바꿈 : 앞으로 이동
		} else {
			return 0;//자리 이동 없음
		}
	}//compareTo
}
public class ComparableTest {

	public static void main(String[] args) {
		TestResult [] tr = {new TestResult("kor",80),
						new TestResult("eng", 100),
						new TestResult("math", 90)};
		System.out.println(Arrays.toString(tr));
		System.out.println("=================");
		Arrays.sort(tr);
		System.out.println(Arrays.toString(tr));
	}

}




