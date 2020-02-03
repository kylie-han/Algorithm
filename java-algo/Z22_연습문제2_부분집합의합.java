/**
 *  ��� �κ������� ���ҷ� �ϴ� ����
 * 	1. �ݺ���
 * 	2. ���̳ʸ� ī����
 * 	3. ���ȣ�� - ���ϴ� ������ �߰��� �� ����
 * 
 * @author multicampus
 *
 */


public class Z22_��������2_�κ��������� {
	public static int[] arr = {1,2,3,4,5,6,7,8,9,10};// �κ������� �̰��� �ϴ� ����.
	public static void main(String[] args) {
		//�ð� üũ�ϴ� ���
		long startTime = System.currentTimeMillis();	// 1970�� 1�� 1�� 0�� 0�� 0�� 000ms 

		// arr�� ��� �κ������� ���غ���
		boolean[] a = new boolean[arr.length];//	�κ������� ���Ҹ� ������� ���θ� ������ �迭, 0�� �ε����� ��� // ���̳ʸ�ī����ó�� ����ϸ� 1�̰� �ƴϸ� 0
		backtrack(a, 0, a.length,0);// �κ������� ����� ����ϴ� �޼���
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime + "ms");
	}//end of main
	
	
//	[]a : �迭������ ��������� ������ �迭,, k : ����ܰ�, input : �ܰ��� ��(k == input)�� �� ������ ����
//			sum : �� �ܰ���� �κ������� ��
	public static void backtrack(boolean[] a,int k,int input, int sum) {
		if (k == input) {// ������Ʈ(���ΰ�?) ->����ܰ谡 �������ܰ��̸� ����ϴ� �޼��带 ȣ���Ѵ�.
			if (sum == 10) {
				process_solution(a, k); //����ϴ� �޼���
			}
		} else {//�����Ʈ
			boolean[] c = new boolean[2];//�ĺ����� ���� �迭 true, false
			int ncands = make_candidates(a, k, input, c);//�ĺ����� ����
			for (int i = 0; i < ncands; i++) {
				a[k] = c[i];
				int nextSum = sum + (a[k] ? arr[k] :0);
//				0~k������ ������ ���� 10 �Ѿ�� ���� �ƴϹǷ� continue;
				if(nextSum>10) continue;
				backtrack(a, k+1, input,nextSum);
			}//�ĺ����� ������ŭ �ݺ�, �迭�� ���Ҹ� �ְ� ���ȣ��

		}
	}
	
//	�ĺ��� �迭�� ���� ��, �ĺ��� ������ ���� ����
	public static int make_candidates(boolean[] a, int k, int input, boolean[] c) {
		// TODO Auto-generated method stub
		c[0] = true;
		c[1] = false;
		return 2;
	}

//	�迭�� ������ ��뿩�θ� ���� �ͷ�
	public static void process_solution(boolean[] a, int k) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]) {
				System.out.print(arr[i]+" ");//���� ����ϱ�
			}
		} System.out.println();
	}
}//end of class
