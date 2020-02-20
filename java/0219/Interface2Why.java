import java.util.Arrays;

/*
 * ��� ����.
 * - ��ӹ޾� ���� �ض�! - ����.
 * - ��ӹ޴� class���� �̷� ���¸� ���߾�� �Ѵ�! - ���̵�.(����)
 * - ��� ���踦 ����, ������ ������ �����ϵ��� ����� �ش�.
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
