
public class ExceptionThrows {
	public void idCheck(String id) throws Exception{
		if (!id.equals("ssafy")) throw new Exception();
		else {
			System.out.println(id);
		}
		
	}
	public static void main(String[] args) {
		ExceptionThrows et = new ExceptionThrows();
		try {
			et.idCheck("ssafy");
		} catch (Exception e) {
			System.out.println("ssafy¾Æ´Ô");
		}
	}
}
