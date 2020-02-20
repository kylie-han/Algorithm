import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {

	public static void main(String[] args) {
		int [][] map = {{9,8},{6,5},{3,2}};
		AlgoUtil.printTab(map);
		System.out.println("===============");
		Arrays.sort(map, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
		AlgoUtil.printTab(map);
	}//main

}
