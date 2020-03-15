import java.util.Arrays;
import java.util.Scanner;

/**
 * ���� - �켱���� 
 * �ߺ��� ����
 * =>���ѽð� �ʰ�
 * �������� O[N^2]
 *
 */
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();// 1~50
		for (int t = 1; t <= TC; t++) {
			int N = sc.nextInt();// �̸��� ���� 1~20,000

			String[] name = new String[N];
			for (int i = 0; i < N; i++) {
				name[i] = sc.next();
			}
//			// �������� - �켱����
//			// 0~�� name[0] <-> name[minIndex]
//			// 1~�� name[1] <-> name[minIndex]
//			// 2~�� name[2] <-> name[minIndex]
//
//			// ��-1~�� name[��-1] <-> name[minIndex]
			for (int i = 0; i < name.length; i++) {
				int minIndex = i; //�ּҰ��� ���ȣ
				for (int j = i; j < name.length; j++) { //���� i~��
					if ( compare(name[minIndex],name[j]) > 0) {// �ּҰ��̶��, ���ʿ� ��ġ�ؾ��Ѵٸ�
						minIndex = j;// �ּҰ� �ε��� ���
					}
				}
				// name[i] <-> name[minIndex]
				String temp = name[i];
				name[i] = name[minIndex];
				name[minIndex] = temp;
			}
//			System.out.println(Arrays.toString(name));
			// �ߺ��� ����
			Arrays.sort(name);
			System.out.println("#"+t);
			
			String temp = null;
			for (int i = 0; i < name.length; i++) {
				if (!name[i].equals(temp)) {
					System.out.println(name[i]);
				}
				temp = name[i];
			}
		}
		sc.close();
	}
	/**
	 * 
	 * @param pre
	 * @param next
	 * @return �� ���� �ٲ�� �Ѵٸ� ���
	 */
	private static int compare(String pre, String next) {
		if (pre.length() != next.length()) {
		return pre.length() - next.length();
		}else {
			return pre.compareTo(next);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
