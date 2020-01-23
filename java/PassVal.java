class PassRef{
	int passInt;
}
public class PassVal {
	public static void main(String[] args) {
		int a = 7;
		passByValue(a);
		System.out.println("a = "+a);
		
		PassRef ref = new PassRef();
		ref.passInt = 777;
		passByReference(ref);
		System.out.println("ref.passInt = " + ref.passInt);
	}
	public static void passByReference(PassRef ref3) {
		ref3.passInt = 999;
		System.out.println("ref.passInt = "+ref3.passInt);
	}
	public static void passByValue(int c) {
		c = 999;
		System.out.println("c = "+c);
		
	}
}
