import java.util.Scanner;

public class Z18_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//한줄 입력 - 버퍼에 엔터입력시까지의 데이터를 가져가고, 엔터직전까지의 값을 입력으로 사용
//		sc.nextLine();
		
		//기본형 타입계열 - 원하는 데이터형의 데이터를 가져가고 나머지는 지우고 원하는 데이터만 입력으로 사용
//		sc.next();
//		sc.nextInt();
//		sc.nextDouble();
//		sc.nextBoolean();

		System.out.println("몇 살이니?");
		String sss = sc.nextLine();
		int age = Integer.parseInt(sss);
		System.out.println(age + "살");
		
//		sc.nextLine();
		
		System.out.println("이름은 뭐니");
		String name = sc.nextLine();
		System.out.println(name + "안녕");
		sc.close();
	}//end of main
}//end of class
