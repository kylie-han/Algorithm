
public class Array6Directions {

	public static void main(String[] args) {
		int [][] arr = { {1,2,3}
						,{4,5,6}
						,{7,8,9}};
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1-1][1]);//��
//		System.out.println(arr[1+1][1]);//��
//		System.out.println(arr[1][1-1]);//��
//		System.out.println(arr[1][1+1]);//��
//		int [] sero = {-1,1,0,0};//�����¿�//4��Ž��
//		int [] garo = {0,0,-1,1};//�����¿�
//		String [] jisi = {"��","��","��","��"};
		int [] sero = {-1,-1,-1,    1,1,1,   0,0};//8��Ž��
		int [] garo = {-1,0,1,     -1,0,1,  -1,1};
		String [] jisi = {"����","��","����","����","��","����","��","��"};
		for(int a=0; a<arr.length; a++) {
			for(int b=0; b<arr[a].length; b++) {
				System.out.println("���� ��ġ : " + arr[a][b]);
				for(int c=0; c<sero.length; c++) {
					int newX = a+sero[c];
					int newY = b+garo[c];
					if(newX<0 || newY<0
						|| newX>=arr.length || newY>=arr.length) continue;
					System.out.println(jisi[c] + " : " + arr[newX][newY]);
				}//for c
			}//for b
		}//for a
	}//main

}
