/**
 * �迭 : ���� Ÿ�� ������ ����
 * @author multicampus
 *
 */
public class Z03_Array {
	public static void main(String[] args) {
		int[]a;	//�迭���� ����
		a = new int[3];	//�迭 ��ü�� ����
		a[0] = 6;	//�迭���� �ʱ�ȭ
		a[1] = 7;
		a[2] = 8;
	
		int[] b = new int [3];
		b[0] = 9;
		
		int[] d = new int [] {6,7,8};	//�迭 ������ ����, ��ü����, �ʱ�ȭ�� �ѹ���
		
		System.out.println(d[0]*d[1]*d[2]);
		//���� ��
		int sum = 1;	//�ʱⰪ : ���� Ȥ�� ���� �� �����ڿ� ���� �׵��
		for (int i = 0; i < d.length; i++) {
			sum = sum * d[i];
		}
		System.out.println(sum);
		
		int[][] e = new int[3][2];
		e[0][0] = 3;
		e[0][1] = 4;
		e[1][0] = 5;
		e[1][1] = 6;
		e[2][0] = 7;
		e[2][1] = 8;
		System.out.println(e[0][0]);
		System.out.println(e[0][1]);
		System.out.println(e[1][0]);
		System.out.println(e[1][1]);
		System.out.println(e[2][0]);
		System.out.println(e[2][1]);
		
		int[][] f = {{3,4}, {5,6}, {7,8}};
		
		for (int i = 0; i < f.length; i++) {	//f.length == 3
			for (int j = 0; j < f[i].length; j++) {	//f[i].length == 2
				System.out.println(f[i][j]);
			}
		}
		
	}

}
