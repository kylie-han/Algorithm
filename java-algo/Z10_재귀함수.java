
public class Z10_재귀함수 {
	public static int x = 5;
	public int y = 7;
	public static int total;
	public static int f_tot;
	
	public static void main(String[] args) {//클래스명은 대문자로 시작한다
		a(3);
		for (int i = 3; i > 0; i--) {//반복문의 반복하기 위한 조건
			System.out.print(i+" ");
		}
		System.out.println("종료");
		///////////////////////////////
		b(1);//1 2 3 4 5
		///////////////////////////////
		c(2);//2 4 6 8
		///////////////////////////////
		d(3,2,10);
		///////////////////////////////
		e(10,3,0);
		for (int i = 10; i >= 0; i-=3) {
			System.out.print(i+ " ");
		}
		System.out.println();
		///////////////////////////////
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum+=i;
		}System.out.println(sum);
		total = 0;
		f(1,5);//전역변수를 사용하여 합을 구해보자
		System.out.println(total);
		System.out.println(f2(1, 5));
		// 5! = 5*4*3*2*1
		int mul = 1;
		for (int i = 5; i >= 1; i--) {
			mul*=i;
		}System.out.println(mul);
		System.out.println(g2(5));
		f_tot = 1;
		g(5);
		System.out.println(f_tot);
		
	}//end of main
	
//	void 메서드명() {
	
	public static int g2 (int start) {
		if(start <= 1) {
			return start;
		}else {
			return start * g2(start-1);
		}
	}
	public static void g (int start) {
		if(start <= 1) {
			
		}else {
			f_tot *= start;
			g(start-1);
		}
	}
	public static int f2 (int start, int end) {
		if(start>=end) {
			return start;
		}else {
			return start + f2(start+1,end);
		}
	}
	public static void f (int start, int end) {
		if(start>end) {

		}else {
			total+=start;
			f(start+1,end);
		}
	}
	public static void e(int start, int sub, int end) {
		if(start<0) {
			System.out.println();
		}else {
			System.out.print(start+" ");
			e(start-sub, sub, end);
		}
	}
	public static void d(int start,int add,int end) {
		if(start>=end) {
			System.out.println("종료");
		}else {
			System.out.print(start+" ");
			d(start+add,add,end);
		}
	}
	public static void c(int i) {
		if(i>8) {
			System.out.println("종료");
		}else {
			System.out.print(i+" ");
			c(i+2);
		}
	}
	public static void b (int i) {
		if (i==6) {//종료파트
			System.out.println("종료");
		}else { //반복파트
			System.out.print(i+" ");
			b(i+1);
		}
	}
	public static void a (int i) {//메서드명은 소문자로 시작한다
		if (i==0) { //basis case 종료파트//재귀함수의 종료하기 위한 조건
			System.out.println("종료");
		}else { //inductive case 재귀파트
			System.out.print(i+" ");
			a(i-1);//i는 저장되지 않고 계산된 값만 보내진다.
		}
	}
}//end of class
