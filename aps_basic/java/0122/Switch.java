
public class Switch {

	public static void main(String[] args) {
		int a = 2;
		double d = 2.0;//switch불가
		boolean bool = true;//switch불가
		char ch = 'A';
		switch(ch) {
		case 1 : System.out.println("firsrt");break;
		case 2 : System.out.println("second");break;
		case 65 : System.out.println("third");break;//else if
		default : System.out.println("error !!!");//else
		}//switch
		String str = new String("hi");
		switch(str) {
		case "hi" : System.out.println("string firsrt");break;
		case "hello" : System.out.println("second");break;
		default : System.out.println("error !!!");//else
		}//switch
	}

}
