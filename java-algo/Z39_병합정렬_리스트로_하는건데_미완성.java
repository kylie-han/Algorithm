import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Z39_병합정렬_리스트로_하는건데_미완성 {
	public static void main(String[] args) {
		Integer[] arr = {69, 10, 30, 2, 16, 8, 31, 22};
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));	// 배열의 원소를 추가하기
//		ArrayList<Integer> list = new ArrayList<>();
//		for (int i = 0; i < arr.length; i++) {
//			list.add(arr[i]);
//		}
		mergeSort(list);
	}//end of main
	/** 더이상 쪼갤 수 없을 때까지 반반씩 쪼개기, 쪼갠 것을 합치기 */
	public static List<Integer> mergeSort(List<Integer> list) {
		if (list.size() == 1) {
			return list;
		} else {
			int m = list.size()/2;
			List<Integer> left = mergeSort(list.subList(0, m));
			List<Integer> right = mergeSort(list.subList(m, list.size()));
			return merge(left, right);
		}
	}

	public static List<Integer> merge(List<Integer> left, List<Integer> right) {
		List<Integer> result = new ArrayList<Integer>(left.size() + right.size());
		int l = 0;
		int r = 0;
		while (l < left.size() && r < right.size()) {	//둘 다 데이터가 있으면
			if (left.get(l) < right.get(r)) {
				
			}
		}

		return result;
	}
}//end of class
