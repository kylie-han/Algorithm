import java.util.Scanner;
import java.util.Stack;

/**
 * Stack
 * @author multicampus
 *
 */
public class Z13_Stack {
	
	public static int top = -1;
	public static int stack_size = 100;
	public static int[] s = new int[stack_size];
	public static int top2 = -1;
	public static int stack_size2 = 3;
	public static int[] s2 = new int[stack_size2];
	
	
	public static void main(String[] args) {
		
		//스택 간단구현
		s2[++top2] = 1;
		s2[++top2] = 2;
		s2[++top2] = 3;
		System.out.println(s2[top2--]);
		System.out.println(s2[top2--]);
		System.out.println(s2[top2--]);
		
		Stack st = new Stack();	//CollectionFramework class 에 이미 제공 되고있다.
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("push or pop : ");
//		while(true) {
//			String f = sc.nextLine();
//			if (f.equals("push")) {
//				System.out.print("data : ");
//				int inD = sc.nextInt();
//				push(inD);
//			}else if(f.equals("pop")) System.out.println(pop());
//		}
//	}
	
	
	public static void push(int inData) {
		top++;
		if(top > stack_size) {
			System.out.println("overflow");
			return;
		}
		else s[top] = inData;
	}
	public static int pop() {
		int outData = 0;
		if(top == -1) System.out.println("underflow");
		else { 
			outData = s[top];
			top--;
		}
		return outData;
	}
}
