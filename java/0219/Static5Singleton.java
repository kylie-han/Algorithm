//Singleton Design Pattern : 오직 하나만 존재해야 하는 객체를 만들 때 사용.
class Company {
	private static Company com = new Company();//1.private static 변수 선언.
	private Company(){}//2.생성자를 private으로 막음. -> 외부에서 객체 생성 못하게 막음.
	public static Company getInstance() {//3.getInstance 구현.
		return com;
	}
}
public class Static5Singleton {
	public static void main(String[] args) {
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		System.out.println(c1 == c2);//true//싱글턴 객체 주소 비교.
		//Company c3 = new Company();//error//외부에서 객체 생성 못함.
//		Static5Singleton s51 = new Static5Singleton();
//		Static5Singleton s52 = new Static5Singleton();
//		System.out.println(s51 == s52);//false//일반 객체 주소 비교.
	}
}
