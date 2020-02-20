package pkg;

public class AccessData {
	public String puStr = "11111 public...";
	protected String proStr = "22222 protected...";
	String deStr = "33333 default...";
	private String priStr = "44444 private...";
	//1.same class.
	public static void main(String[] args) {
		AccessData ad = new AccessData();
		System.out.println(ad.puStr);
		System.out.println(ad.proStr);
		System.out.println(ad.deStr);
		System.out.println(ad.priStr);
	}
}
