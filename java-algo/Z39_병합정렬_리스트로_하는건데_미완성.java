import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Z39_��������_����Ʈ��_�ϴ°ǵ�_�̿ϼ� {
	public static void main(String[] args) {
		Integer[] arr = {69, 10, 30, 2, 16, 8, 31, 22};
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));	// �迭�� ���Ҹ� �߰��ϱ�
//		ArrayList<Integer> list = new ArrayList<>();
//		for (int i = 0; i < arr.length; i++) {
//			list.add(arr[i]);
//		}
		mergeSort(list);
	}//end of main
	/** ���̻� �ɰ� �� ���� ������ �ݹݾ� �ɰ���, �ɰ� ���� ��ġ�� */
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
		while (l < left.size() && r < right.size()) {	//�� �� �����Ͱ� ������
			if (left.get(l) < right.get(r)) {
				
			}
		}

		return result;
	}
}//end of class
