import java.util.Arrays;

public class Gravity {
	public static void main(String[] args) {//��üȭ�� ����Ű : ctrl + M
		int[] box = {7,4,2,0,0,6,0,7,0};
/*		
//		System.out.println(Arrays.toString(box));	//�迭�� ���Ҹ� �����ϰ� ȭ�鿡 ����ϴ� ���
		int[][] map = new int[8][9];
		
		//1�����迭�� 2�����迭�θ����(�ڽ��� ������ 1, ������ 0)
		for (int c = 0; c < map.length; c++) {	//c:��
			for (int r = map.length-1; r >= 0; r--) {	//r:��
				if (box[c] <= 0) {//�ڽ��� ������ 0���� �۰ų� ������ ��������
					break;
				}
				box[c]--;
				map[r][c] = 1;
			}
		}//map �ϼ�
		//2�����迭�� ȸ��
		int[][] room = new int[9][8];
		for (int i = 0; i < room.length; i++) {	//9
			for (int j = 0; j < room[i].length; j++) {	//8
				room[i][j] = map[map.length-1-j][i];
			}
		}
				
		//�߷��� �߻���Ű��
		
		//�������, ���� �ִ�
		
		//���Ȯ��
		for (int i = 0; i < map.length; i++) {
			System.out.println(Arrays.toString(room[i]));
		}
*/
		int max = 0;
		for (int i = 0; i < box.length; i++) {
			int cnt = 0;
			for (int j = 0; j < box.length; j++) {
				if(box[i]>box[j]) {
					cnt++;
				}
			}
			if(max<cnt) {
				max = cnt;
			}
		}
		System.out.println("�ִ볫�� : "+max);
		//=> ���ϸ� �����ɸ��� �� �����ʿ� ������ ���� ���� � �ִ��� Ȯ��
	}//end of main
}//end of class
