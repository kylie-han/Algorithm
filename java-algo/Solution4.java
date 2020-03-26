import java.util.Scanner;

public class Solution4 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int TC = sc.nextInt();
       for (int testCase = 1; testCase <= TC; testCase++) {//테스트케이스만큼 반복
           String s = sc.next();
           int num =s.charAt(0) == '0'?0:1; //횟수체크용 num, 시작이 0이면 1, 1이면 그대로
           for (int i = 1; i < s.length(); i++) {
               if(s.charAt(i-1) != s.charAt(i)) num+=1;//0에서 1로 바뀌는 부분체크
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