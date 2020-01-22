
public class Z01_test {
//	파일명과 클래스명이 동일할 때 클래스를 public을 쓸 수 있다.
	public static void main(String[] args) {
//		파일을 실행하면 메인메서드를 실행함		
//		ctrl+spacebar
		System.out.println(123);	//화면(콘솔창)에 출력해주는 메서드
//		실행은 Run(ctrl+F11)
//		실행하면 같은 이름의 .class 파일을 만들고 그 파일을 실행함.
		
		for (int i = 2; i <= 9 ; i++) {
			for (int j = 1; j <= 9 ; j++) {
				System.out.println(i+"*"+j+"="+i*j);
				System.out.printf("%d*%d=%d\n",i,j,i*j);
			}
		}
	}//end of main

}
