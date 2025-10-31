package pkg;
/*
 * package : java ���ϰ� class ������ ��ġ�� �����ϴ� ǥ��.
 * - ���� �������� ���� ������ .�� ���� ������.
 * ��) test.pkg : test ���� �ؿ� pkg ��� ������ ���� java ���ϰ� class ������ ��ġ�� ����.
 * - �ϳ��� ���Ͽ��� �ϳ��� package ������ ����.
 * - �Ϲ������� �ҹ��ڷ� ǥ��.
 * - ������ : javac -d . PkgTestObj.java (*.java)
 */
public class PkgTestObj {
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String toString() {
		return "message : "+message;
	}
	public void print() {
		System.out.println("message : "+message);
	}
}
