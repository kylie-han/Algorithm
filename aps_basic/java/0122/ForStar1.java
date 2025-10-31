
public class ForStar1 {

	public static void main(String[] args) {
		for(int y=0; y<5; y++) {
			for(int x=5; x>0; x--) {
				if(y==x) break;
				System.out.print(" ");
			}
			for(int x=0; x<5; x++) {
				System.out.print("*");
				if(y == x) break;
			}
			System.out.println();
		}
		System.out.println("=====");
		for(int y=0; y<5; y++) {
			for(int x=5; x>0; x--) {
				if(y==x) break;
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====");
		for(int y=0; y<5; y++) {
			for(int x=0; x<5; x++) {
				System.out.print("*");
				if(y == x) break;
			}
			System.out.println();
		}
	}

}
