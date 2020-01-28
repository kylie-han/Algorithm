/**
 * 스택구현
 * @author multicampus
 *
 */
public class Z13_Stack2 {
	public static int[] s = new int [3];
	public static int top = -1;	//가장 마지막에 입력된 꼭대기의 데이터 위치를 가리킬 인덱스
	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
	}//end of main
	public static void push(int data) {
		// TODO Auto-generated method stub
		top++;	//인덱스 먼저 올림
		if(top >= s.length) {
			System.out.println("overflow error");
			return;
		}else {
		s[top] = data;
		}
	}
	
}//end of class
