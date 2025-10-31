import java.util.Arrays;

/*
 * 사용 이유.
 * - 상속받아 구현 해라! - 강제.
 * - 상속받는 class들은 이런 형태를 갖추어야 한다! - 가이드.(명세서)
 * - 상속 관계를 만들어서, 다형성 적용이 가능하도록 만들어 준다.
 */
class InterfaceSort implements Comparable<InterfaceSort> {
	int sortVar;
	InterfaceSort(int i) { this.sortVar = i; }
	@Override
	public int compareTo(InterfaceSort o) {
		return this.sortVar - o.sortVar;
	}
	@Override
		public String toString() {
			return ""+this.sortVar;
		}
}
public class Interface2Why {
	public static void main(String[] args) {
		InterfaceSort []  arr = {new InterfaceSort(999), new InterfaceSort(7), new InterfaceSort(123)};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
