import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

/**
 * 
 * 삽입 정렬
 * 
 * @author multicampus
 *
 */
public class Z27_Insertion {
	public static void main(String[] args) {
		int[] arr = new int[600000];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(arr.length);
		}
		long startTime = System.currentTimeMillis();
		
		ArrayList<Integer> list = new ArrayList<Integer>();// 정렬이 된 숫자들을 저장할 객체
//		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			int index = 0;
			for(; index < i; index++) {
				if (arr[i] < list.get(index)) {
					break;
				}
			}
			list.add(index, arr[i]);
		}
		System.out.println(list);
		System.out.println(System.currentTimeMillis() - startTime + "ms");
	}//end of main
}//end of class
