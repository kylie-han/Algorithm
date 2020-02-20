class PrintOnly {
	@Override
	public String toString() {
		return "Class PrintOnly...";
	}
}
interface PrintOnlyInterface {
	public String toString();
}
public class Inner5Anonym0 {
	public static void main(String[] args) {
		//1단계
		PrintOnly p1 = new PrintOnly();
		System.out.println("p1 : "+p1);
		//2단계
		System.out.println("p2 : "+ new PrintOnly());
		//2단계
		System.out.println("p3 : " + new PrintOnlyInterface() {
			public String toString() {
				return "interface PrintOnlyInterface...";
			}
		});//Anonymous Inner Class...
	}

}
