public class boj_4673_셀프넘버_bronze1_Main {
	static boolean[] arr = new boolean[10000];

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < arr.length; i++) {
			if (!arr[i]) {
//				System.out.println("unchecked : "+i);
//				System.out.println(i);
				sb.append(i).append("\n");
				d(i);
			}
		}
		System.out.print(sb);
	}

	private static void d(int n) {
		// 종료조건
		if (n >= 10000 || arr[n])
			return;
		
		arr[n] = true;// 주의!! dn이 arr.length를 넘길 가능성 있음
//		System.out.println("checked : " + n);
		int dn = n;
		// n의 각 자리수의 합
		while (n != 0) {
			dn += n % 10;
			n = n / 10;
		}
		d(dn);
	}

}
