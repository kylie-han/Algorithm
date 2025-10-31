
public class Continue {

	public static void main(String[] args) {
		for(int dan=2; dan<10; dan++) {
			for(int gop=1; gop<10; gop++) {
				//if(gop == 5) continue;//°Ç³Ê¶Ù±â
				if((gop%2) == 0) continue;
				System.out.println(dan+" * "+gop+" = "+ (dan*gop));
			}
		}//for
	}//main

}
