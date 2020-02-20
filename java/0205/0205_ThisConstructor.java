/*
 * 생성자 안에서 this 사용했을 때, 자기 객체의 다른 생성자를 호출.
 * - 생성자의 첫 번째 줄에서만 사용 가능.!!!
 */
public class ThisConstructor {
	public ThisConstructor(){
		//System.out.println("no arg cons start!!!");
		this(3);
		System.out.println("no arg cons end!!!");
	}
	public ThisConstructor(int i){
		this(i,"No Message.");
	}
	public ThisConstructor(int i, String s){
		for(int a=0; a<i; a++) {
			System.out.print(s+"\t");
		}
	}
	public static void main(String[] args) {
		ThisConstructor tc = new ThisConstructor();
	}

}
