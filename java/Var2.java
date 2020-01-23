// data type casting 형 변환
// promotion : 작은 data type -> 큰 data type
// demotion : 큰 data type -> 작은 data type
public class Var2 {
	public static void main(String[] args) {
		short s = 123;
		int i = s;	//묵시적 data type casting, 자동
		short s2 = (short) i; //명시적 data type casting, 강제
		// 정수형의 기본은 int
		long l1 = 123456L;
		byte b1 = 7, b2 = 8;
		// byte b3 = b1 + b2;//연산 과정에서 int 변환
		byte b3 = (byte)(b1 + b2);
		//부작용
		int i2 = 300;
		byte b4 = (byte)i2;
		System.out.println(b4);
		//ascii code casting
		char ch = 65;
		System.out.println(ch);
		int i3 = ch;
		System.out.println(i3);
	}

}
