import java.util.Arrays;
import java.util.Scanner;
// 현재 나보다 덩치가 큰 것이 몇개 있는지 확인하고 +1하면 내 순위 나옴
public class boj_7568_덩치_Main {
	static int N;
	static Person[] size;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		size = new Person[N];
		for (int i = 0; i < N; i++) {
			size[i] = new Person(sc.nextInt(), sc.nextInt(),0);
		}
//		System.out.println(Arrays.toString(size));
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				if(size[i].x > size[j].x && size[i].y > size[j].y) size[j].cnt++;
				else if(size[j].x > size[i].x && size[j].y > size[i].y) size[i].cnt++;
			}
		}
		for (int i = 0; i < size.length; i++) {
			System.out.print(size[i].cnt+1 + " ");
		}
	}
}
class Person {
	int x;
	int y;
	int cnt;
	
	public Person(int x, int y, int cnt) {
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "Person [x=" + x + ", y=" + y + ", cnt=" + cnt + "]";
	}
}
