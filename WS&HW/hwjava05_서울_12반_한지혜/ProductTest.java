
public class ProductTest {
	public static void main(String[] args) {
		
		RefrigeratorClass sr = new RefrigeratorClass("RF10R9990M1", "�����÷��� �йи����", "10,100,000 ��", 23, 921);

		TVClass st = new TVClass("QN65Q950RBF-M", "QLED 8K 163 cm", " 6,330,000 ��", 0, 64, "QLED 8K");
		System.out.println(sr.toString());
		System.out.println(st.toString());
		
	}
}
