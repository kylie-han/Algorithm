/*
666
1666
2666
3666
4666
5666
6660
6661
6662
6663
6664
...
6669
7666
8666
9666
10666
11666
12666
13666
14666
15666
16660
 */


import java.util.Scanner;

public class boj_1436_¿µÈ­°¨µ¶¼ò_Main {
	static int N;
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int cnt = 0;
		int num = 0;
		while(cnt != N) {
			num++;
			if((num+"").contains("666")) {
				cnt++;
				ans = num;
			}
		}
//		int x = (num+"").indexOf("6");
//		ans = (num+"").substring(0, x)+"66"+(num+"").substring(x, (num+"").length());
		System.out.println(ans);
		sc.close();
	}
}
