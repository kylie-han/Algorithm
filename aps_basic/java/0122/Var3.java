
public class Var3 {

	public static void main(String[] args) {
		Integer i1 = new Integer(777);
		System.out.println(i1);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		Integer i2 = new Integer("123456");
		System.out.println(i2);
		double d = i2.doubleValue();
		System.out.println("d : " + d);
		System.out.println(Integer.max(100, 999));
		//
		String s1 = new String("13579");
		String s2 = new String("11110");
		System.out.println(s1 + s2);
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
	}

}
