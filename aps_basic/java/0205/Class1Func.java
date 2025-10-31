import java.util.Arrays;

//기능 요소만 있는 class
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
