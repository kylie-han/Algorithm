import java.util.Scanner;

public class Main_boj_2941_ũ�ξ�Ƽ�ƾ��ĺ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int cnt = str.replace("c=", " ").replace("c-", " ")
				.replace("dz=", " ").replace("d-"," ").replace("lj"," ")
				.replace("nj"," ").replace("s="," ").replace("z="," ").length();
		System.out.println(cnt);
	}
}
