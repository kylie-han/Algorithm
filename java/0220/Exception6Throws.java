/*
 * throw : Exception 발생 시키는 표현.
 * throws : Exception이 발생한 코드를 호출한 메소드에게 Exception 처리를 떠넘기는 표현.
 */
public class Exception6Throws {

	public void throwTest() {
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println("Exception 발생 지점에서 처리");
		}
	}
	public void throwsTest() throws NullPointerException {
		throw new NullPointerException();
	}
	//idCheck 메소드를 호출한 곳으로, NullPointerException을 보내 주아라.
	public void idCheck(String id) throws NullPointerException {
		if(!id.equals("SSAFY")) {
			throw new NullPointerException();
		}
	}
	public static void main(String[] args) {
		Exception6Throws e6 = new Exception6Throws();
		e6.throwTest();
		try {
			e6.throwsTest();
		} catch (NullPointerException e) {
			System.out.println("throws를 통해 Exception을 넘겨 받아 처리.");
		}
		System.out.println("Why???==============");
		try {
			e6.idCheck("ssafy");
		} catch (NullPointerException e) {
			System.out.println("존재하지 않는 아이디 입니다.");
		}
	}

}












