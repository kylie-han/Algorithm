import java.util.Scanner;
//입력된 문자열에서 가장 많이 사용된 알파벳을 출력(대문자)
public class boj_1157_단어공부_b1_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] arr = new int[26];	// 알파벳 개수만큼의 배열(26개)
		// 입력된 문자열의 알파벳위치의 값을 증가시켜
		for (char c : str.toCharArray()) {
			int i = (c-'A')%32;
			arr[i]++;
		}
		//배열에서 최댓값을 갖고 있는 인덱스를 찾고
		int index = 0;
		int max = arr[index];
		boolean f = false;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max) {
				index = i;max = arr[i]; f = false;
			}else if(arr[i] == max) {
				index = i; max = arr[i]; f = true;
			}
		}
		//인덱스 위치의 문자 출력
		char out = f == false ? (char)(index+'A') : '?';
		System.out.println(out);
	}
}
