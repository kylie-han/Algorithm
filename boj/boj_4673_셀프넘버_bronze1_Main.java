public class boj_4673_�����ѹ�_bronze1_Main {
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
		// ��������
		if (n >= 10000 || arr[n])
			return;
		
		arr[n] = true;// ����!! dn�� arr.length�� �ѱ� ���ɼ� ����
//		System.out.println("checked : " + n);
		int dn = n;
		// n�� �� �ڸ����� ��
		while (n != 0) {
			dn += n % 10;
			n = n / 10;
		}
		d(dn);
	}

}
