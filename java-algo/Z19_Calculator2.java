/**
 * ���� 2
 * 1�ܰ�. ����ǥ���-> ����ǥ������� ��ȯ
 * 2�ܰ�. ����ǥ����� ���.
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
			default://�ǿ�����,����
				stackNum[++top] = Integer.parseInt(srr[i]);
				break;
			}
		}
		//���ÿ��� ���� �Ѱ��� ��������
		System.out.println(stackNum[top--]);
		
		
		
		
		////////////////////////////////////////////////
//		���ڿ� => �⺻�� Ÿ��
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
	
		
		
//		�⺻�� Ÿ�� => ���ڿ�
		int x = 3;
		boolean f = false;
		String s = x + "";
		s = String.valueOf(x);
		s = new Integer(x).toString();
		}//end of main
}//end of class


