
public class MainMember2 extends Member {
	private String hobby;
	public MainMember2(){}
	public MainMember2(String name, int age, String email, String hobby){
		super(name, age, email);
		setHobby(hobby);
	}
	public MainMember2(String name, int age, String email){
		this(name, age, email, "");
	}
	public String toString() {
		String info = super.toString()+"\t"+hobby;
		return info;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}
