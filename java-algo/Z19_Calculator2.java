/**
 * 계산기 2
 * 1단계. 중위표기법-> 후위표기법으로 변환
 * 2단계. 후위표기법을 계산.
 * @author multicampus
 * 
 * 
 * 
 * 
 * 	
 *
 */
public class Z19_Calculator2 {
	public static void main(String[] args) {
		String[] srr = {"6","5","2","8","-","*","2","/","+"};
		int[]stackNum = new int[srr.length];
		int top = -1;
		for (int i = 0; i < stackNum.length; i++) {
			char c = srr[i].charAt(0);
			int num2,num1;
			switch (c) {
			case '+':
				num2 = stackNum[top--];
				num1 = stackNum[top--];
				stackNum[++top] = num1 + num2;
				
				break;
			case '-':
				num2 = stackNum[top--];
				num1 = stackNum[top--];
				stackNum[++top] = num1 - num2;
			
				break;
			case '*':
				num2 = stackNum[top--];
				num1 = stackNum[top--];
				stackNum[++top] = num1 * num2;
			
				break;
			case '/':
				num2 = stackNum[top--];
				num1 = stackNum[top--];
				stackNum[++top] = num1 / num2;
			
				break;
			default://피연산자,숫자
				stackNum[++top] = Integer.parseInt(srr[i]);
				break;
			}
		}
		//스택에는 숫자 한개만 남아있음
		System.out.println(stackNum[top--]);
		
		
		
		
		////////////////////////////////////////////////
//		문자열 => 기본형 타입
		String ss = "123";
		int w = Integer.parseInt(ss);
		w = Integer.valueOf(ss);
		System.out.println(w);
		
		ss = "3.14";
		double d = Double.parseDouble(ss);
		d = Double.valueOf(ss);
		System.out.println(d);
		
		ss = "q";
		char ccc = ss.charAt(0);
		System.out.println(ccc);
	
		
		
//		기본형 타입 => 문자열
		int x = 3;
		boolean f = false;
		String s = x + "";
		s = String.valueOf(x);
		s = new Integer(x).toString();
		}//end of main
}//end of class


