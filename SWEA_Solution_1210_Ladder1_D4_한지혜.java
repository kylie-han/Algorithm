import java.util.Arrays;
import java.util.Scanner;

public class SWEA_Solution_1210_Ladder1_D4_������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TN = sc.nextInt();	//�׽�Ʈ���̽�
		int[][] arr = new int[10][10];	//�迭�� ũ�� : 100,100
		int x = 0,y = 9;
		//�迭 ����
		for (int i = 0; i < 1; i++) {//�׽�Ʈ ���̽� 10��
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[i].length; k++) {
					arr[k][j] = sc.nextInt();
					if(arr[k][j] == 2) x = j; 
				}
			}
		}
		//�迭 ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println(x);//�������� ��ġ->9
		y--;//8
		for (int i = 0; i < 100 ; i++) {
			if(arr[x-1][y] != 0) x--;
			else if(arr[x+1][y] != 0) x++;
			else {
				y--;
				if (y<=0) {
					System.out.println(y);
					break;
				}
			}
			System.out.println(x+","+y);
		}
		System.out.println(y);
	}//end of main
}//end of class
