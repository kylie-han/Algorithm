package imprt;

import java.util.Scanner;
import pkg.PkgTestObj;

/*
 * import
 * - �� ���Ͽ��� �ʿ�� �ϴ� �ٸ� class ������ ��ġ�� ����.
 * - import�� ���� ������ �ٸ� class ������ ���� ����� ǥ��.
 * - ���� �������� ���� ������ .�� ���� ������.
 * - �Ϲ������� �ҹ��ڷ� ǥ��.
 * - �ϳ��� ���Ͽ� ���� import ������ ������.
 * ��) import java.util.Scanner;
 *     java ���� �ؿ� util ���� �ؿ� �ִ� Scanner class�� ClassLoader�� load �϶�.
 * ���� ��) import java.util.*;//����!!!
 *        java ���� �ؿ� util ���� �ؿ� �ִ� ��� class�� ClassLoader�� load �϶�.
 *        �޸𸮿� �ð� ���� �߻�.
 *        ����, �� �ʿ��� class�� import �ϴ� ���� ����.
 */
public class ImportTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PkgTestObj obj = new PkgTestObj();
		obj.setMessage("simple package & import test.....");
		obj.print();
	}

}
