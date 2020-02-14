import java.util.Scanner;

public class 정올_1863_종교_Main {
	public static int[] p;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		p = new int[n+1];
		for (int i = 0; i < p.length; i++) {
			p[i] = i;
		}
		for (int i = 0; i < m; i++) {
			int s1 = sc.nextInt();
			int s2 = sc.nextInt();
			union(s1,s2);
		}
		int cnt=0;
		for (int i = 1; i < p.length; i++) {
			
			if(p[i] == i)cnt++; 
		}
		System.out.println(cnt);
	}//end of main
	
	public static void union(int s1, int s2) {
		int ps1 = findSet(s1);
		int ps2 = findSet(s2);
		if(ps1 != ps2) {	// 다른 집합일때만 합치기
			p[ps2] = ps1;	// y집합의 대표자 인덱스에 x집합의 대표자를 넣는다.
		}
	}
	
	public static int findSet(int x) {
		if(p[x] == x) {
			return x;
		}else {
			return p[x]= findSet(p[x]);//Path compression
		}
	}
	
}//end of class

