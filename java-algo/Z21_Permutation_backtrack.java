
/**
 * 
 * ����
 * 
 * @author multicampus
 *
 */
public class Z21_Permutation_backtrack {
	public static int[] arr = {3,6,7};// ������ �̰��� �ϴ� ����.
	public static void main(String[] args) {
		// arr�� ������ ���غ���
		int[] a = new int[arr.length];//	������ ������ �迭, 0�� �ε����� ��� // ���̳ʸ�ī����ó�� ����ϸ� 1�̰� �ƴϸ� 0
		backtrack(a, 0, a.length);// �κ������� ����� ����ϴ� �޼���
	}//end of main
	
	
//	[]a : ������ ������ �迭,, k : ����ܰ�, input : �ܰ��� ��(k == input)�� �� ������ ����
	public static void backtrack(int[] a,int k,int input) {
		if (k == input) {// ������Ʈ(���ΰ�?) ->����ܰ谡 �������ܰ��̸� ����ϴ� �޼��带 ȣ���Ѵ�.
		process_solution(a,k);	//����ϴ� �޼���
		} else {//�����Ʈ
			int[] c = new int[a.length];//(������� ���� ����)�ĺ����� ���� �迭 
			int ncands = make_candidates(a, k, input, c);//�ĺ����� ����
			for (int i = 0; i < ncands; i++) {
				a[k] = c[i];
				backtrack(a, k+1, input);
			}//�ĺ����� ������ŭ �ݺ�, �迭�� ���Ҹ� �ְ� ���ȣ��

		}
	}
	
//	�ĺ��� �迭�� ���� ��, �ĺ��� ������ ���� ����
	public static int make_candidates(int[] a, int k, int input, int[] c) {
		//k�ܰ� ������ ����� ���ڸ� ������ ���ڸ� �ĺ������� �����
		//�÷��� ������ (k�ܰ�)���ݱ��� ����� ���ڸ� üũ
		boolean[] in_perm = new boolean[arr.length];
		for (int i = 0; i < k; i++) {	//�� �ܰ������� ����� ���ڸ� üũ
			in_perm[a[i]] = true;
		}
		
		//�÷��� ������ ���� ������� ���� ���ڸ� �ĺ������� ����
		int ncands = 0; // �ĺ����� ���� ������ ��
		for (int i = 0; i < in_perm.length; i++) {
			if (!in_perm[i]) {
				c[ncands] = i;
				ncands++;
			}
		}
		return ncands;// �ĺ����� ����
	}

//	������ �ͷ�
	public static void process_solution(int[] a, int k) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(arr[a[i]]+" ");//���� ����ϱ�
//			System.out.print(a[i]+" ");//���� ����ϱ�
		}System.out.println();
	}
}//end of class
