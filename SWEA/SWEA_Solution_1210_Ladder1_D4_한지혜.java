import java.util.Arrays;
import java.util.Scanner;

public class SWEA_Solution_1210_Ladder1_D4_������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[102][102];	//�迭�� ũ�� : 100,100//üũ�ϱ� ���Ϸ��� �迭�� ũ�⸦ �����Ӱ� ����
		//�迭 ����
		for (int i = 0; i < 10; i++) {//�׽�Ʈ ���̽� 10��			
			int x = 100,y = 0;
			int TN = sc.nextInt();	//�׽�Ʈ���̽�
			for (int j = 1; j < arr.length-1; j++) {
				for (int k = 1; k < arr[i].length-1; k++) {
					arr[j][k] = sc.nextInt();
					if(arr[j][k] == 2) y = k;//�������� y���� ã�� k�� ����
				}
			}
//			System.out.println("arr["+x+"],["+y+"]="+arr[x][y]);//�������� ��ġ->10			
//			//�迭 ���
//			for (int i1 = 0; i1 < arr.length; i1++) {
//				System.out.println(Arrays.toString(arr[i1]));
//			}
			x--;//9
			int mark = 0; //�Ž��� �ö󰡴� ������ üũ�ϱ� ���� mark�̴�.
			for (int j = 0; x > 0 ; j++) {
				if(arr[x][y-1] == 1 && mark == 0 ) {//������ 1�̰� �������ο��� �����̸� �������� ����.
					y--;
					mark = 0;//�������� ���� ��
				}
				else if(arr[x][y+1] == 1 && mark == 1 ) {//�������� 1�̰� ���������ο��� �����̸� ���������� ����.
					y++;
					mark = 1;//���������� ���� ��
				}
				else {//�� �� �ƴϸ� ��ĭ ���� �ö󰣴�.
					x--;
					mark = 2;
				}
			}
			System.out.println("#"+TN+" "+(y-1));
		}
	}//end of main
}//end of class