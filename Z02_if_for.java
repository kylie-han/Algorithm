//한줄 주석		//부터 끝까지
/*
 * 여러줄 주석, 부분 주석
 */
/**
 * 문서주석
 *	클래스, 메서드. 변수의 선언부앞에 작성해서 부가적인 설명을 함
 */



public class Z02_if_for {
	public static void main(String[] args) {
//		변수(메모리 크기가 정해짐), 참조형(기본형이 아닌 타입)
//		기본형 타입 변수 : 8가지
//		정수형 	byte(1), short(2,c언어와의 호환성), "int"(4,가장빠름), long(8,예를들어 주민번호)
//		실수형	float(4), "double"(8)
//		문자형	char(2)
//		논리형	boolean(1)
		
		byte a; //변수선언
		a = 3;	//초기화 : 처음 값을 할당
		short b = 3;	//변수선언과 초기화를 한번에
		int c = 4;
		long d = 5L;	//리터럴 접미사 L or l
		
		float e = 3.14f;	//리터럴 접미사 F or f
		double g = 3.14;	//리터럴 접미사 D or d or 생략가능
		
		char h = '뷁';	//한글자만 표현가능-유니코드 어떤 글자든 가능
		
		boolean i = true;	//논리값 true/false
		i = false; //마지막에 저장한 값만 기억한다.
		System.out.println(i);	//변수의 값이 출력된다. 
		// 남의 소스코드를 잘 분석해야 한다*
		String s = "안녕하세요";	//문자열을 저장한 배열
		String ss = new String("안녕하세요");
		
//		문자열 덧셈연산
		s = "안녕" + "하세요";	//문자열 연결
		s = "안녕" + 3;	//문자열 ,비문자열 연결
		
		System.out.println(s);
		System.out.println(3 + 4 + "안녕" + 3 + 4);	//연산자는 기본적으로 두 숫자만 계산,
		
		int t = 5;
		String sss = "" + t;	//비문자열을 문자열로 변환
		
		System.out.println(t);
		
		/////////////////////////////////////////////////
//		자바의 조건문 : if~else, switch~case, 삼항연산자
//		if(조건식) {	//조건식은 true/false boolean 타입의 결과를 넣어야 한다.
//			조건이 참인 경우 실행			
//		} else if(조건식2){
//			조건식2가 참인경우 실행		
//		} else{
//			조건식이 거짓인 경우 실행
//		}
//		
//		swap 값의 교환
		int x = 5;
		int y = 7;
		
//		int temp;
//		temp = x;
//		x = y;
//		y = temp;
		
		x = x+y;	//x = 12, y = 7
		y = x-y;	//12, 5
		x = x-y;	//7, 5
		
		System.out.println(x+", "+y); //7, 5
		
		x = 8;
		if (x%2 == 0 ) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		int n = -3;
		int m = -7;
		int v = -5;
		
//		int z = 0;	//초기값 중요
//		if(n>m) {
//			z = n;
//			if(z>v) {
//				System.out.println(z);
//			}else {
//				System.out.println(v);
//			}
//		}else {
//			z = m;
//			if(z>v) {
//				System.out.println(z);
//			}else {
//				System.out.println(v);
//			}
//		}
		
		int max = Integer.MIN_VALUE;
//		int max = -100;	//초기값 중요
		//이 세상의 가장 작은 값으로 초기화
		//비교할 원소중 가장 작은 값으로 초기화
		if (max<n) max = n;
		if (max<m) max = m;
		if (max<v) max = v;
		
//		자바의 반복문 : for, while, do~while
//		for (초기식;조건식;증감식){
		for(int j = 0; j < 5; j++) {
			System.out.println(j);
		}
		
		
		
	}// end of main

}// end of class
