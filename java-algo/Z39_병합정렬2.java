import java.util.Arrays;
import java.util.Random;

public class Z39_병합정렬2 {
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
			merge(arr, left, mid, right);	//두덩어리를 합쳐라 left~mid, mid~right
			return;
		}
	}
	/** 두덩어리를 합쳐라 left~mid, mid~right*/
	public static void merge(int[] arr, int left, int mid, int right) {
		int[] temp = new int[right-left];//병합하면서 저장할 임시 배열 준비
		int l = left;	//왼쪽배열의 인덱스
		int r = mid;	//오른쪽 배열의 인덱스
		int index = 0;
		while(l<mid &&r<right) {	//양쪽 모두 남아있으면
			if (arr[l] < arr[r]) {
				temp[index++] = arr[l++];
			} else {
				temp[index++] = arr[r++];
			}
		}
		//왼쪽만 남아있으면
		System.arraycopy(arr, l, temp, index,mid-l );
		//오른쪽만 남아있으면
		System.arraycopy(arr, r, temp, index,right-r );
		//임시배열 temp의 값을 원본배열 arr 에 옮기기
		System.arraycopy(temp, 0, arr, left,right-left);
	}	
}//end of class
