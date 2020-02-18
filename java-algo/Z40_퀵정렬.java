import java.util.Arrays;

/**
 * 
 * MergeSort : O[n logn]
 * 			�־��� ��쿡�� ����� �ӵ��� ����
 * QuickSort : O[n logn]
 * 			�����Ͱ� ���� ��� ������, �־��� ���  : O[n^2]
 * ���ҵ� Hoare-Partition �˰���(���������� ���� ���ȴ�.)
 * 		�Ǻ��� ���������� ����
 * 
 */
public class Z40_������ {
	public static int[] arr = {0,9,8,7,6,5,4,3,2,1};
	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
		int l = 0;
		int r = arr.length-1;
		quickSort(l, r);
		System.out.println(Arrays.toString(arr));
		
		
	}//end of main
	/** �Ǻ��� �������� �����ϴ� �˰���, �Ǻ��� ���ĵ� ��ġ�� ���Ѵ�.*/
	public static void quickSort(int l, int r) {
		if (l >= r) {
			return;
		}
		int pivot = partition(l,r);
		quickSort(1, pivot-1);
		quickSort(pivot+1, r);
	}
	/** �Ǻ��� �������� �۰� ���� ���� ���� ū ���� �������� ��ġ�� �Ǻ���ġ�� ����*/
	public static int partition(int l, int r) {
		int pivot = l;
		while(l<=r) {
			while(l< arr.length && arr[l] <= arr[pivot]) l++;
			while(0<= r &&arr[pivot] < arr[r]) r--;;
			if (l < r) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
		}
		int tmp = arr[r];
		arr[r] = arr[pivot];
		arr[pivot] = tmp;
		return r;
	}
	
}//end of class
