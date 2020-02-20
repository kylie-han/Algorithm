
public class MainMember extends Member {
	private String hobby;
	public MainMember(){}
	public MainMember(String name, int age, String email, String hobby){
		setName(name);
		setAge(age);
		setEmail(email);
		setHobby(hobby);
	}
	public MainMember(String name, int age, String email){
		this(name, age, email, "");
	}
	public String toString() {
		String info = getName()+"\t"+getAge()+"\t"+getEmail()+"\t"+hobby;
		return info;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}
