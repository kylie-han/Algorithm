/**�κ�����
 * 
 * � ������ ��� �κ������� ���ҷ� �ϴ� ���� : ������ Powerset
 * @author multicampus
 *
 */
public class Z08_subset {
	public static void main(String[] args) {
		int[] a = {-7,-3,-2,5,8};
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					for (int l = 0; l < 2; l++) {
						for (int m = 0; m < 2; m++) {
							int sum = 0;
							if (i==1) sum += a[0];
							if (j==1) sum += a[1];
							if (k==1) sum += a[2];
							if (l==1) sum += a[3];
							if (m==1) sum += a[4];
							
							//���� 0�� ��� �κ������� ����Ͻÿ�
							if (sum == 0) {
								if (i==1) System.out.print(a[0]+" ");
								if (j==1) System.out.print(a[1]+" ");
								if (k==1) System.out.print(a[2]+" ");
								if (l==1) System.out.print(a[3]+" ");
								if (m==1) System.out.print(a[4]+" ");
								System.out.println();
							}
						}
					}
				}
			}
		}
		//���̳ʸ� ī����
		int[] b = {3,4,5,6};
//		��� �κ������� ���ϱ� ���ؼ� ���Ұ� 4���ϱ� 4�� ��Ʈ�� �ʿ���, 0-15 ���ڸ� ��Ʈ����ŷ�� ���� ���Ҹ� ������ ����
		for (int i = 0; i < (1<<b.length); i++) {//1<<n: �κ������� ����
			System.out.printf("%2d :   ",i);
			for (int j = 0; j < b.length; j++) {
				if ((i & (1<<j)) != 0) System.out.print(b[j]+",");
			}
//			if ((i & (1<<0)) != 0) System.out.print(b[0]+",");
//			if ((i & (1<<1)) != 0) System.out.print(b[1]+",");
//			if ((i & (1<<2)) != 0) System.out.print(b[2]+",");
//			if ((i & (1<<3)) != 0) System.out.print(b[3]+",");
			System.out.println();
		}
	}//end of main
}//end of class

//for (int j = 0; j < n; j++) {//������ ����ŭ ��Ʈ�� ����
//	if (i & (1<<j)) {//i��j��° ��Ʈ�� 1�̸� j��° ���� ���
//		System.out.println("%d, ", b[j]);
//	}	
//}		