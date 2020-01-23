
public class Var3 {
	public static void main(String[] args) {
		Integer i1 = new Integer(777);
		System.out.println(i1);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		Integer i2 = new Integer("123456");//MIN_VALUE < x < MAX_VALUE, 사이값 x 만 만들 수 있다.
		System.out.println(i2);
		double d = i2;
		//
		String s3 = new String("1579");
		String s2 = new String("11110");
		System.out.println(s3 + s2);
		System.out.println(Integer.parseInt(s3) + Integer.parseInt(s2));
		
		
	}
}
