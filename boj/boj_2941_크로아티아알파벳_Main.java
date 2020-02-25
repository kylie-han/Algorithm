//import java.util.Scanner;
//
//public class boj_2941_크로아티아알파벳_Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		int cnt = str.replace("c=", " ").replace("c-", " ")
//				.replace("dz=", " ").replace("d-"," ").replace("lj"," ")
//				.replace("nj"," ").replace("s="," ").replace("z="," ").length();
//		System.out.println(cnt);
//	}
//}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class  boj_2941_크로아티아알파벳_Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt = str.replace("c=", " ").replace("c-", " ")
				.replace("dz=", " ").replace("d-"," ").replace("lj"," ")
				.replace("nj"," ").replace("s="," ").replace("z="," ").length();
		System.out.println(cnt);
	}
}
