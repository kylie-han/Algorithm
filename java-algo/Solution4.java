import java.util.Scanner;

public class Solution4 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int TC = sc.nextInt();
       for (int testCase = 1; testCase <= TC; testCase++) {//�׽�Ʈ���̽���ŭ �ݺ�
           String s = sc.next();
           int num =s.charAt(0) == '0'?0:1; //Ƚ��üũ�� num, ������ 0�̸� 1, 1�̸� �״��
           for (int i = 1; i < s.length(); i++) {
               if(s.charAt(i-1) != s.charAt(i)) num+=1;//0���� 1�� �ٲ�� �κ�üũ
           }
           System.out.println("#"+testCase+" "+num);
       }
   }
}
//import java.util.Scanner;
//
//public class Solution4 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int TC = sc.nextInt();
//		for (int testCase = 1; testCase <= TC; testCase++) {
//			String s = sc.next();
//			char[] data = s.toCharArray();
//			int num;
//			if (data[0] == '0') {
//				num = 0;
//			}else {
//				num = 1;
//			}
//			for (int i = 1; i < data.length; i++) {
//				if(data[i-1] != data[i]) num+=1;
//			}
//			System.out.println("#"+testCase+" "+num);
//		}
//	}
//}