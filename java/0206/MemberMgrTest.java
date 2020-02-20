
public class MemberMgrTest {

	public static void main(String[] args) {
		MemberMgr mgr = new MemberMgr();
		mgr.add(new Member("È«±æµ¿", 16, "no@no.com"));
		mgr.add(new MainMember("Àü¿ìÄ¡", 16, "no2@no2.com"));
		
		Member m = mgr.getMember("È«±æµ¿");
		if(m != null) {
			System.out.println(m);
		}
	}

}
