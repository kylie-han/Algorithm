import java.util.Arrays;
import java.util.Random;

public class Z39_��������2 {
	public static int[] arr = new int[100];
	
	public static void main(String[] args) {
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(arr.length);
		}
		mergeSort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}//end of main
	public static void mergeSort(int[] arr, int left, int right) {
		if(right - left <= 1) {
			return;
		} else {
			int mid = (right + left)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid, right);
			merge(arr, left, mid, right);	//�ε���� ���Ķ� left~mid, mid~right
			return;
		}
	}
	/** �ε���� ���Ķ� left~mid, mid~right*/
	public static void merge(int[] arr, int left, int mid, int right) {
		int[] temp = new int[right-left];//�����ϸ鼭 ������ �ӽ� �迭 �غ�
		int l = left;	//���ʹ迭�� �ε���
		int r = mid;	//������ �迭�� �ε���
		int index = 0;
		while(l<mid &&r<right) {	//���� ��� ����������
			if (arr[l] < arr[r]) {
				temp[index++] = arr[l++];
			} else {
				temp[index++] = arr[r++];
			}
		}
		//���ʸ� ����������
		System.arraycopy(arr, l, temp, index,mid-l );
		//�����ʸ� ����������
		System.arraycopy(arr, r, temp, index,right-r );
		//�ӽù迭 temp�� ���� �����迭 arr �� �ű��
		System.arraycopy(temp, 0, arr, left,right-left);
	}	
}//end of class
