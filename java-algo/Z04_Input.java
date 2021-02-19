import java.util.Scanner;

/**
 * 자바의 입력방법
 * Scanner
 */
public class Z04_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//입력을 받기 위해서 객체생성을 한번 해야한다.
		System.out.println("이름을 입력하세요");
		String name = sc.next();//String 리턴
		System.out.println(name+"님 몇살이에요?");
		int age = sc.nextInt();//int 리턴
		System.out.println(age + "살 입니다");
		sc.close();
	}//end of main
}//end of class
