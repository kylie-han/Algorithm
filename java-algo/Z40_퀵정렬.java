import java.util.Arrays;

/**
 * 
 * MergeSort : O[n logn]
 * 			최악의 경우에도 비슷한 속도를 보장
 * QuickSort : O[n logn]
 * 			데이터가 많을 경우 빠르다, 최악의 경우  : O[n^2]
 * 퀵소드 Hoare-Partition 알고리즘(전통적으로 많이 사용된다.)
 * 		피봇은 좌측끝으로 지정
 * 
 */
public class Z40_퀵정렬 {
	public static int[] arr = {0,9,8,7,6,5,4,3,2,1};
	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
		int l = 0;
		int r = arr.length-1;
		quickSort(l, r);
		System.out.println(Arrays.toString(arr));
		
		
	}//end of main
	/** 피봇을 기준으로 분할하는 알고리즘, 피봇은 정렬된 위치로 변한다.*/
	public static void quickSort(int l, int r) {
		if (l >= r) {
			return;
		}
		int pivot = partition(l,r);
		quickSort(1, pivot-1);
		quickSort(pivot+1, r);
	}
	/** 피봇을 기준으로 작고나 같은 값은 왼쪽 큰 값은 우측으로 배치후 피봇위치를 리턴*/
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
