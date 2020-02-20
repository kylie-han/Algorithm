//Singleton Design Pattern : ���� �ϳ��� �����ؾ� �ϴ� ��ü�� ���� �� ���.
class Company {
	private static Company com = new Company();//1.private static ���� ����.
	private Company(){}//2.�����ڸ� private���� ����. -> �ܺο��� ��ü ���� ���ϰ� ����.
	public static Company getInstance() {//3.getInstance ����.
		return com;
	}
}
public class Static5Singleton {
	public static void main(String[] args) {
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		System.out.println(c1 == c2);//true//�̱��� ��ü �ּ� ��.
		//Company c3 = new Company();//error//�ܺο��� ��ü ���� ����.
//		Static5Singleton s51 = new Static5Singleton();
//		Static5Singleton s52 = new Static5Singleton();
//		System.out.println(s51 == s52);//false//�Ϲ� ��ü �ּ� ��.
	}
}
