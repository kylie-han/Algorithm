import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		/*while(false) {
			System.out.println("print");
		}*/
		Scanner scan = new Scanner(System.in);
		int uSelect = 0;
		do {
			System.out.println("���� ���־��� �޴��� ?");
			System.out.println("1. A�޴�, 2. B�޴�");
			System.out.print("���� : ");
			uSelect = scan.nextInt();
			if(uSelect == 1){
				System.out.println("�κα�ġ");
			} else if(uSelect == 2){
				System.out.println("������");
			} else {
				System.out.println("�ٽ� �����ϼ���.");
				uSelect = 0;
			}
		} while(uSelect == 0);
		System.out.println("bye~~~~~~~");
	}//main

}
