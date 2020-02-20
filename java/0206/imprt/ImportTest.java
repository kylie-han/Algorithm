package imprt;

import java.util.Scanner;
import pkg.PkgTestObj;

/*
 * import
 * - 현 파일에서 필요로 하는 다른 class 파일의 위치를 지정.
 * - import를 통해 지정된 다른 class 파일을 가져 오라는 표현.
 * - 상위 폴더에서 하위 폴더로 .을 통해 접근함.
 * - 일반적으로 소문자로 표현.
 * - 하나의 파일에 여러 import 선언이 가능함.
 * 예) import java.util.Scanner;
 *     java 폴더 밑에 util 폴더 밑에 있는 Scanner class를 ClassLoader에 load 하라.
 * 나쁜 예) import java.util.*;//비추!!!
 *        java 폴더 밑에 util 폴더 밑에 있는 모든 class를 ClassLoader에 load 하라.
 *        메모리와 시간 낭비 발생.
 *        따라서, 꼭 필요한 class만 import 하는 것을 권장.
 */
public class ImportTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PkgTestObj obj = new PkgTestObj();
		obj.setMessage("simple package & import test.....");
		obj.print();
	}

}
