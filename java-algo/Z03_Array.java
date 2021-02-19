/**
 * 배열 : 같은 타입 변수의 묶음
 * @author multicampus
 *
 */
public class Z03_Array {
	public static void main(String[] args) {
		int[]a;	//배열변수 선언
		a = new int[3];	//배열 객체를 생성
		a[0] = 6;	//배열변수 초기화
		a[1] = 7;
		a[2] = 8;
	
		int[] b = new int [3];
		b[0] = 9;
		
		int[] d = new int [] {6,7,8};	//배열 변수의 선언, 객체생성, 초기화를 한번에
		
		System.out.println(d[0]*d[1]*d[2]);
		//원소 합
		int sum = 1;	//초기값 : 곱셈 혹은 덧셈 등 연산자에 대한 항등원
		for (int i = 0; i < d.length; i++) {
			sum = sum * d[i];
		}
		System.out.println(sum);
		
		int[][] e = new int[3][2];
		e[0][0] = 3;
		e[0][1] = 4;
		e[1][0] = 5;
		e[1][1] = 6;
		e[2][0] = 7;
		e[2][1] = 8;
		System.out.println(e[0][0]);
		System.out.println(e[0][1]);
		System.out.println(e[1][0]);
		System.out.println(e[1][1]);
		System.out.println(e[2][0]);
		System.out.println(e[2][1]);
		
		int[][] f = {{3,4}, {5,6}, {7,8}};
		
		for (int i = 0; i < f.length; i++) {	//f.length == 3
			for (int j = 0; j < f[i].length; j++) {	//f[i].length == 2
				System.out.println(f[i][j]);
			}
		}
		
	}

}
