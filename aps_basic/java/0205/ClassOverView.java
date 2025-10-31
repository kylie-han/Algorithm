/*
 * high level language : �ΰ��� �˱� ���� ǥ����. - c, java.
 * low level language : ��谡 �˱� ���� ǥ����.(0/1) - OMRī��, õ��ī��.
 * 
 * class : Ư�� ����� ��ü���� �𵨸��� ���� �ڹ� ���� ����� ��
 * - ~.java : ���� - class�� ����� ����. object ���赵.
 * - class ���� : ����ϴ� ���.
 * - ������ ������ ���� ~.class����(bytecode)�� ��ȯ.
 * - jvm�� bytecode�� �����ϸ鼭 ����.
 * - instance : jvm�� ���ؼ� ����� ���.
 * - ��ü���� �𵨸� ����� �Ӽ�(data ��� : variable)�� ���(���� ��� : method).
 * - data ��Ҹ� �ִ� class, ��� ��Ҹ� �ִ� class, data ��ҿ� ��� ��Ҹ� ��� ������ �ִ� class.
 * 
 * Object : ���� ����� ���������� ���.
 * class : ���� ����� ���������� ��� ���� ���赵(data�� ���). �ڹ� ���Ͽ� ����.
 * instance : class�� ������ �޸𸮿� �ö� ����.
 * class �ϳ��� ���Ѵ��� instance ���� ����.
 * - class�� 24�� ����Ʈ ���赵. -> ���� ����Ʈ ����ä �̻� ���� ����.
 */
public class ClassOverView {

	public static void main(String[] args) {
		Class1Data data = new Class1Data();
		Class1Func func = new Class1Func();
		System.out.println("=====���� ��=====");
		func.print(data.arr);
		func.arrange(data.arr);
		System.out.println("=====���� ��=====");
		func.print(data.arr);
	}

}







