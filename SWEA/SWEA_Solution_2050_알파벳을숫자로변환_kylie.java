import java.util.Scanner;

public class SWEA_Solution_2050_���ĺ������ڷκ�ȯ_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inData = sc.nextLine();//�Է��� ���ڿ�
		char[] inD_arr = inData.toCharArray();//���ڿ� -> �迭
		//�� ���
		for (int i = 0; i < inD_arr.length; i++) {
			System.out.print((int)inD_arr[i]-64 + " ");//(int)'A' = 65
		}
	}//main
}//class
