import java.util.Arrays;

public class Z16_Exam {
	public static void main(String[] args) {
		//swap
		//배열의 원소합
		//최대값, 초기값 : min_value, 이 세상에서 작은 값, 비교할 값 중 가장 작은 값
		//존재유무
		int[] arr = {2,4,6,8,1,3,5,7,};
		int key = 1;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key) {
				flag = true;
				break;//브레이크가 없으면 완전탐색, 브레이크 있으면 백트랙킹
			}
		}
		if(flag) System.out.println("있다.");
		else System.out.println("없다.");
////////////////////////////////////////////////////		
//		int[] arr = {2,4,6,8,1,3,5,7,};
//		int key = 1;
//		for (int i = 0; i < arr.length; i++) {
//			if(key == arr[i]) {
//				System.out.println("있다.");
//				break;
//			}
//			if(i == arr.length-1) {//마지막경우까지 없을땐 없다 출력
//				System.out.println("없다.");
//			}
//////////////////////////////////////////////////////
		int[] brr = {3,3,2,1,1,4,1,4};
		key = 1;
		int count = 0;
		for (int i = 0; i < brr.length; i++) {
			if (key == brr[i]) {
				count++;
			}
		}
		System.out.println(count + "번");
//////////////////////////////////////////////////////
		int[] crr = {3,3,2,1,1,4,1,4};
		int[] cnt = new int[5];
//		int cnt1 = 0;
//		int cnt2 = 0;
//		int cnt3 = 0;
//		int cnt4 = 0;
		for (int i = 0; i < crr.length; i++) {
			cnt[crr[i]]++;
//			if(crr[i] == 1) {
//				cnt[1]++;
//			}
//			if(crr[i] == 2) {
//				cnt[2]++;
//			}
//			if(crr[i] == 3) {
//				cnt[3]++;
//			}
//			if(crr[i] == 4) {
//				cnt[4]++;
//			}
		} System.out.println(Arrays.toString(cnt));
		
	}
}
