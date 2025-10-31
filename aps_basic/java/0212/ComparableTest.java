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
			return 1;//�ڸ� �ٲ� : �ڷ� �̵�
		} else if(this.jumsu < o.jumsu) {
			return -1;//�ڸ� �ٲ� : ������ �̵�
		} else {
			return 0;//�ڸ� �̵� ����
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




