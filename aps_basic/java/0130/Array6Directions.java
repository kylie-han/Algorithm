
public class Array6Directions {

	public static void main(String[] args) {
		int [][] arr = { {1,2,3}
						,{4,5,6}
						,{7,8,9}};
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1-1][1]);//상
//		System.out.println(arr[1+1][1]);//하
//		System.out.println(arr[1][1-1]);//좌
//		System.out.println(arr[1][1+1]);//우
//		int [] sero = {-1,1,0,0};//상하좌우//4방탐색
//		int [] garo = {0,0,-1,1};//상하좌우
//		String [] jisi = {"상","하","좌","우"};
		int [] sero = {-1,-1,-1,    1,1,1,   0,0};//8방탐색
		int [] garo = {-1,0,1,     -1,0,1,  -1,1};
		String [] jisi = {"상전","상","상후","하전","하","하후","좌","우"};
		for(int a=0; a<arr.length; a++) {
			for(int b=0; b<arr[a].length; b++) {
				System.out.println("현재 위치 : " + arr[a][b]);
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
