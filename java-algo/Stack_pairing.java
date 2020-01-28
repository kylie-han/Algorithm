
public class Stack_pairing {
	public static void main(String[] args) {
		String str1 = "()()((()))";
		String str2 = "((()((((()()((()())((())))))";
		
		char[] crr = new char[100];
		int top = -1;
		
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == '(') {
				crr[++top] = str1.charAt(i);
			}else if(str1.charAt(i) == ')') {
				crr[top--] = 0;
			}
		}
		if(top !=-1 ) System.out.println("error : "+top);
		else System.out.println("correct : "+ top);
	}//end of main
}//end of class
