  
import java.util.Arrays;

public class �����˻�_������ {
	public static void main(String[] args) {
		int[] a = {4,9,11,23,2,19};
		int find = 5;//ã���� �ϴ� ��
		int n = 0;
		Arrays.sort(a);//�־��� �迭 ����
		n = a.length/2;
//		System.out.println(Arrays.toString(a));//�迭 Ȯ��
		for (int i = 0; i < a.length; i++) {
			if (a[n] == find) {
				System.out.println("�˻� ����");
				break;
			}
			else if (a[n] > find) {
				n = n/2;
				if(n/2 == 0) n--;
			}
			else if (a[n] < find) {
				n = n+n/2;
				if(n/2 == 0) n++;
			}
		}
	}//end of main
}//end of class