/*
 * ������ �ȿ��� this ������� ��, �ڱ� ��ü�� �ٸ� �����ڸ� ȣ��.
 * - �������� ù ��° �ٿ����� ��� ����.!!!
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
