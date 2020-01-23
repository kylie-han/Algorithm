
public class While {
	public static void main(String[] args) {
		int a = 1;//초기식
		while (a<=10) {//조건식
			System.out.println(a);
			a++;//변경식
		}//while
		int dan = 2;
		while (dan < 10) {//조건식
			int gop = 1;
			while(gop < 10) {
				System.out.println(dan + " * "+gop+" = "+(dan*gop));
				gop++;
			}
			dan++;//변경식
		}//while
	}//main
}//class
