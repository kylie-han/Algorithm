import java.util.Scanner;

public class boj_13305_¡÷¿Øº“_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] km = new int[N-1];
		for (int i = 0; i < km.length; i++) {
			km[i] = sc.nextInt();			
		}
		int[] oil = new int[N];
		for (int i = 0; i < oil.length; i++) {
			oil[i] = sc.nextInt();
		}
		long sum = 0;
		long cost = Integer.MAX_VALUE;
		for (int i = 0; i < km.length; i++) {
			System.out.println("sum = " + sum);
			System.out.println("cost = "+cost);
			System.out.println("oil[" + i + "] = " + oil[i]);
			cost = oil[i] < cost ? oil[i] : cost;
			sum += cost * km[i];
		}
		System.out.println(sum);
	}
}
