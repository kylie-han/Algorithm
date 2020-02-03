/**
 * ��� �κ������� ���ҷ� �ϴ� ����
 * 	1. �ݺ���
 * 	2. ���̳ʸ� ī����
 * 	3. ���ȣ�� - ���ϴ� ������ �߰��� �� ����
 * 
 * @author multicampus
 *
 */
public class Z20_Powerset_backtrack {
	public static int[] arr = {3,6,7};// �κ������� �̰��� �ϴ� ����.
	public static void main(String[] args) {
		// arr�� ��� �κ������� ���غ���
		boolean[] a = new boolean[arr.length];//	�κ������� ���Ҹ� ������� ���θ� ������ �迭, 0�� �ε����� ��� // ���̳ʸ�ī����ó�� ����ϸ� 1�̰� �ƴϸ� 0
		backtrack(a, 0, a.length);// �κ������� ����� ����ϴ� �޼���
	}//end of main
	
	
//	[]a : �迭������ ��������� ������ �迭,, k : ����ܰ�, input : �ܰ��� ��(k == input)�� �� ������ ����
	public static void backtrack(boolean[] a,int k,int input) {
		if (k == input) {// ������Ʈ(���ΰ�?) ->����ܰ谡 �������ܰ��̸� ����ϴ� �޼��带 ȣ���Ѵ�.
		process_solution(a,k);	//����ϴ� �޼���
		} else {//�����Ʈ
			boolean[] c = new boolean[2];//�ĺ����� ���� �迭 true, false
			int ncands = make_candidates(a, k, input, c);//�ĺ����� ����
			for (int i = 0; i < ncands; i++) {
				a[k] = c[i];
				backtrack(a, k+1, input);
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
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			if(a[i]) {
				System.out.print(arr[i]+" ");//���� ����ϱ�
			}
		}System.out.println();
	}
}//end of class
