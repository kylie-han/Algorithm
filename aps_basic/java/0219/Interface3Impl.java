/*
 * implements : �����ϴ�.
 * ��) InterfaceSort implements Comparable : InterfaceSort�� Comparable�� �����ߴ�.
 * - ���� ����� ���� �غ�.
 *   ��) class AAA extends BBB implements CCC, DDD, EEE.....
 * - ��� ���踦 ����, ������ ������ �����ϵ��� ����� �ش�.
 * - �������� ���� class�鿡�� �������� �ο�.
 */
interface CCC {}
interface DDD {}
class BBB {}
class AAA extends BBB implements CCC, DDD {}

interface EEE extends CCC, DDD {}
//interface FFF implements CCC, DDD {}//error
/*
 * interface ������ extends�� ���� ���� ��� ����.
 * ���� ��� ���� ���� : static ����� abstrac �޼ҵ� �θ� �̷���� �ֱ� ����. -> ���� ����� ��ȣ�� ����.
 */
public class Interface3Impl {
	public static void main(String[] args) {
	}
}
