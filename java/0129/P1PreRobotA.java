
public class P1PreRobotA {

	public static void main(String[] args) {
		char [] carr = {'S', 'A', 'S', 'S', 'W', 'S'};
		int spaceCnt = 0;
		for(int a=0; a<carr.length; a++) {
			if(carr[a] == 'A') {
				System.out.println("a : " + a);
				for(int b=a+1; b<carr.length; b++) {
					if(carr[b] == 'W') break;
					if(carr[b] == 'S') ++spaceCnt;
				}//for
			}//if
		}//for
	}

}
