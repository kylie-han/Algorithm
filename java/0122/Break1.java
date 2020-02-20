
public class Break1 {

	public static void main(String[] args) {
		for(int dan=2; dan<10; dan++) {
			for(int gop=1; gop<10; gop++) {
				if(gop == 5) break;//Å»ÃâÇÏ±â
				System.out.println(dan+" * "+gop+" = "+ (dan*gop));
			}
		}//for
	}//main

}
