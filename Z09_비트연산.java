/**
 * 
 * @author multicampus
 *
 */
public class Z09_비트연산 {
	public static void main(String[] args) {
		int a = 15;
		System.out.println(a);//10진수로 출력
		System.out.println(Integer.toBinaryString(a));//바이너리로 출력
		System.out.println(Integer.toString(a, 10));// 지정한 진법으로 출력
		
		int b = 9;
		int c = 13;
		System.out.println(Integer.toBinaryString(b)+" b");//바이너리로 출력
		System.out.println(Integer.toBinaryString(c)+" c");//바이너리로 출력
		System.out.println(Integer.toBinaryString(b&c)+" b&c");//바이너리로 출력
		System.out.println(Integer.toBinaryString(b|c)+" b|c");//바이너리로 출력

		System.out.println(Integer.toBinaryString(1<<0)+" 1<<0");//2^0
		System.out.println(Integer.toBinaryString(1<<1)+" 1<<1");//2^1
		System.out.println(Integer.toBinaryString(1<<2)+" 1<<2");//2^2
		System.out.println(Integer.toBinaryString(1<<3)+" 1<<3");//2^3
		//	<<	쉬프트 연산은 *2한 효과이다.
		//	>>	쉬프트 연산은 /2한 효과이다.
		
//		비트 마스킹 : 원하는 비트의 값만 뽑아내기 
		int n = 0b100110111; //2진수
//		int n = 017; //15/8진수
//		int n = 0xF; //15/16진수

//		System.out.println(Integer.toBinaryString(n & 0b1<<5));
		
		System.out.println((n & 0b1<<0) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<1) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<2) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<3) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<4) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<5) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<6) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<8) == 0 ? 0 : 1);
		System.out.println((n & 0b1<<7) == 0 ? 0 : 1);
		
		System.out.println("반복문으로 비트를 출력하기(쉬프트 연산자 활용)");
		for (int i = 0; i < 9; i++) {
			System.out.println((n & 1<<i) == 0 ? 0 : 1);
		}
	}
}
