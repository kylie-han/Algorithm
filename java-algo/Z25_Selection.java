import java.util.Arrays;

/**
 *  ��������
 *  	������ �ּҰ��� ã�Ƽ� ������ ù��° ��ġ�� �ڸ� �ٲ�
 * @author multicampus
 *
 */
public class Z25_Selection {
	public static void main(String[] args) {
		int[] arr = {5,7,2,9,3,6,1,4,8};
		
		for (int i = 0; i < arr.length; i++) {//������ ������ġ�� ������ ����
			int min = Integer.MAX_VALUE;
			int idx = 0;
			for (int j = i; j < arr.length; j++) {//���� i~8
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
