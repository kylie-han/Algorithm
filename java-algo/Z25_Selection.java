import java.util.Arrays;

/**
 *  선택정렬
 *  	영역의 최소값을 찾아서 영역의 첫번째 위치와 자리 바꿈
 * @author multicampus
 *
 */
public class Z25_Selection {
	public static void main(String[] args) {
		int[] arr = {5,7,2,9,3,6,1,4,8};
		
		for (int i = 0; i < arr.length; i++) {//영역의 시작위치를 지정할 변수
			int min = Integer.MAX_VALUE;
			int idx = 0;
			for (int j = i; j < arr.length; j++) {//영역 i~8
				if(min > arr[j]) {
					min = arr[j];
					idx = j;
				}
			}
			arr[idx] = arr[i];
			arr[i] = min;
		}
		System.out.println(Arrays.toString(arr));
	}//end of main
}//end of class
