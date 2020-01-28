/**
 * String
 * StringBuilder	단일쓰레드용
 * StringBuffer		멀티쓰레드용
 * @author multicampus
 *
 */
public class Z12_StringBuilder {
	public static void main(String[] args) {
		String str = "hello";
//		str += "a";
		str = str.concat("a");//저장하려면 재할당 해줘야함.
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder("hello");//빈공간 16칸 더 만들어진다.
		sb.append("a");//뒤에 a를 붙여준다.
//		sb.delete(start, end)
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);//실행한 결과로 저장됨
		
		String s = "hello";
		// String => StringBuilder로 변경하기	
		StringBuilder ssbb = new StringBuilder(s);
		ssbb.reverse();//역순으로
		s = ssbb.toString(); //StringBuilder => String 로 변경하기
		System.out.println(s);
		
		s = "hello";
		System.out.println(new StringBuilder(s).reverse().toString());
		
	}//end of main
}//end of class
