import java.io.FileInputStream;
import java.util.ArrayList;

/*
 * Java Error 종류.
 * - compile error : 문법 에러 -> 코드 수정으로 해결.
 * - runtime error : 실행 중 오류. fatal error와 exception.
 * fatal error : 구조적 오류. - 메모리 부족 등.
 * exception : 예외 상황. : 프로그래머가 예상치 못한 실행 중의 문제.
 * - 게임 중에 엄마가 랜선을 뽑았다!!!
 * exception handling : 예외 상황 처리. : 미리 예외 상황 예측 + 대응 방법 제시.
 * - 예외 상황 시에, 오작동 방지, 상황 안내, 안전한 프로그램 종료 등 처리.
 * - 로그를 남겨, 이후에 원인 분석이 가능하도록 처리.
 * Exception 전달 과정.
 * - jvm이 프로그램을 실행하므로, 가장 먼저 Exception을 확인함.
 * - jvm은 발생한 Exception을 정보(Exception) 객체로 만들어서 프로그램에 전달.
 * - 상세한 Exception 내용을 알 수 있음.
 * Tip!!! Exception 상속 구조 중요!!!
 */
public class Exception1OverView {

	public static void main(String[] args) {
		//FileInputStream fis = new FileInputStream("C:/neverfind.txt");
		//예외 상황 예측. -> 대응 방법 제시를 요구.
		//args[0] = "hi";//ArrayIndexOutOfBoundsException
		String s = null;
		//System.out.println(s.length());//NullPointerException
		//System.out.println(999/0);//ArithmeticException
		System.out.println("111"+"222");
		System.out.println(Integer.parseInt("111")+Integer.parseInt("222"));
		//System.out.println(Integer.parseInt("1 11"));//NumberFormatException
		ArrayList list = new ArrayList();
		list.add(new Exception1OverView());
		ArrayList list2 = (ArrayList) list.get(0);//ClassCastException
	}

}





