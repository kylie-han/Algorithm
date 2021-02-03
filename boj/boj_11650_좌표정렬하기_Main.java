import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class boj_11650_좌표정렬하기_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Loc[] arr = new Loc[N];
		for (int i = 0; i < arr.length; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[i] = new Loc(x,y);
		}
		Arrays.sort(arr,new Comparator<Loc>() {
			@Override
			public int compare(Loc o1, Loc o2) {
				if(o1.x == o2.x) {
					return o1.y-o2.y;
				}
				return o1.x-o2.x;
			}
		});
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}
}
class Loc{
	int x;
	int y;
	public Loc(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return x + " " + y;
	}
}
