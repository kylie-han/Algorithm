//Loop Statement
public class While1 {
	public static void main(String[] args) {
		int a = 1;//�ʱ��
		while(a <= 10) {//���ǽ�
			//System.out.println(a);
			a++;//�����
		}
		int dan = 2;
		while(dan < 10) {
			int gop = 1;
			while(gop < 10) {
				System.out.println(dan+" * "+gop+" = "+(dan*gop));
				gop++;
			}
			dan++;
		}
	}//main
}
