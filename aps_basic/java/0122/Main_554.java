import java.util.Scanner;

public class Main_554 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalLine = scan.nextInt();
		int num = 1;
		char ch = 'A';
		for(int y=1; y<=totalLine; y++) {
			for(int x=totalLine; x>0; x--) {
				System.out.print(num++ + " ");
				if(y == x) break;
			}
			for(int z=0; z<totalLine; z++) {
				if(y == z) break;
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}

	}

}
