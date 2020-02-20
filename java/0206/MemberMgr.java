
public class MemberMgr {
	private Member [] members = new Member[10];
	private int idx=0;
	public void add(Member m) {
		members[idx] = m;
		idx++;
	}
	public Member getMember(String name) {
		Member tmp = null;
		for(int i=0; i<idx; i++) {
			if(members[i].getName().equals(name)) {
				tmp = members[i];
				break;
			}
		}
		return tmp;
	}
}
