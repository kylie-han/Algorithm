import java.util.Arrays;

//��� ��Ҹ� �ִ� class
public class Class1Func {
	public void arrange(int [] intArr) {
		Arrays.sort(intArr);
	}
	public void print(int [] intArr) {
		for(int a : intArr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
