import java.util.Arrays;

/**
 * 문자열
 * @author multicampus
 *
 */
public class Z11_String {
	public static void main(String[] args) {
//		String		1234567890
		String s = "abcDefGHij";
//		System.out.println(s);
		p(s);
		p(s.length()+" : 문자열의 길이");
		p(s.concat("xyz")+ " : 문자열 이어붙여줌");
		p(s.replace("def","xxxxxxxx")+ " : 문자열 변경");
		p(s.replace("def", ""));
		p(s.substring(5)+" : 5번부터 끝까지(5번 포함)");
		p(s.substring(5,8)+" : 5~7까지(시작은 포함, 마지막은 불포함)");
		p(s.toLowerCase()+" : 모두 소문자로 변경");
		p(s.toUpperCase()+ " : 모두 대문자로 변경");
		p(s.equals("abcDefGHij") + " : 같은지 확인");	//참조변수의 내용을 비교시 ==하면 안된다.
		p(s.equals("abcdefghij") + " : 같은지 확인");	
		p(s.equalsIgnoreCase("abcdefghij") + " : 같은지 확인");
		p("    a   b  cde  ".trim()+ "문자열 앞 뒤의 화이트스페이스를 제거"	);	//공백, 탭, 줄바꿈	(앞뒤만 가능)
		p(s.indexOf("b")+" : b 글자의 index");
		
		p(s.charAt(3) + " : 3번째 인덱스 글자 리턴");
		
		String s2 = "abcDefGHij";
		for (int i = 0; i < s2.length(); i++) {
			System.out.print(s2.charAt(i)+" ");
		}
		System.out.println();
		char[] crr = s2.toCharArray();
		System.out.println(Arrays.toString(crr));
		for (int i = 0; i < crr.length; i++) {
			System.out.print(crr[i] + " ");
		}
		System.out.println();
		
		String str = "호랑이,사자,기린,토끼,다람쥐";
		String[] srr = str.split(",");//문자열 쪼개기, 정규화 표현식이 가능
		System.out.println(Arrays.toString(srr));
		
		String ss1 = "hello";//기본형 타입 선언하는 것처럼 선언(권장)
		String ss2 = "hello";// 재활용하므로 메모리 절약, 시간 절약
		String ss3 = new String("hello");//클래스 객체 선언
		String ss4 = new String("hello");
		
		System.out.println(ss1 == ss2);//true 주소비교
		System.out.println(ss3 == ss4);//false 주소비교
		System.out.println(ss1.equals(ss3));//true 내용물 비교
		
		String ss5 = ss1.toUpperCase().toLowerCase().replace("ll", "LL");//원본은 그대로 있다,작업한 내용을 리턴해준다.
		System.out.println(ss1);
		System.out.println(ss5);
		
		/////////역순으로 (olleh)출력///////////////
		String ss6 = "hello";
		char[] crr1 = ss6.toCharArray();
		char[] olleh = new char[5];
		for (int i = crr1.length-1; i >= 0; i--) {
			olleh[crr1.length-1-i] = crr1[i];		
		}
		System.out.println(Arrays.toString(olleh));
		/////////////////////////////////////////////
		for (int i = 0; i < crr1.length; i++) {
			System.out.print(ss6.charAt(ss6.length()-1-i));
		}System.out.println();
		for (int i = ss6.length()-1; i >= 0; i--) {
			System.out.print(ss6.charAt(i));
		}System.out.println();
		String z = "";
		for (int i = 0; i < ss6.length(); i++) {
			z = ss6.charAt(i) + z;
		}System.out.println(z);
		/////////////////////////////////////////////
		
	}//end of main
	public static void p(String str) {
		System.out.println(str);
	}
}//end of class
