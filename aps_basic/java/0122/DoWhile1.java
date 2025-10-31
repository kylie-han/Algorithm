import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		/*while(false) {
			System.out.println("print");
		}*/
		Scanner scan = new Scanner(System.in);
		int uSelect = 0;
		do {
			System.out.println("오늘 맛있었던 메뉴는 ?");
			System.out.println("1. A메뉴, 2. B메뉴");
			System.out.print("선택 : ");
			uSelect = scan.nextInt();
			if(uSelect == 1){
				System.out.println("두부김치");
			} else if(uSelect == 2){
				System.out.println("볶음밥");
			} else {
				System.out.println("다시 선택하세요.");
				uSelect = 0;
			}
		} while(uSelect == 0);
		System.out.println("bye~~~~~~~");
	}//main

}
