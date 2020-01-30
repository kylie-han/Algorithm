/**
[Ãâ·Â]
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8 
5 6 7 8 9 
6 7 8 9 10 

 * @author jh han
 *
 */
public class k547_Main {
	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int s = 2;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = s;
				s++;
			}
			s -= 4;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
