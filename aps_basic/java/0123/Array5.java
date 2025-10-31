
public class Array5 {

	public static void main(String[] args) {
		int[][] gugu = new int[8][9];
		for(int dan=2, a=0; dan<10; dan++, a++) {
			for(int gop=1, b=0; gop<10; gop++, b++) {
				gugu [a][b] = dan * gop;
			}
		}//for
		//
		for(int a=0; a<gugu.length; a++) {
			for(int b=0; b<gugu[a].length; b++) {
				System.out.print(gugu [a][b] + " ");
			}
			System.out.println();
		}//for
	}

}
