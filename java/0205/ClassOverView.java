/*
 * high level language : 인간이 알기 쉬운 표현법. - c, java.
 * low level language : 기계가 알기 쉬운 표현법.(0/1) - OMR카드, 천공카드.
 * 
 * class : 특정 대상을 객체지향 모델링에 따라 자바 언어로 기술한 것
 * - ~.java : 문서 - class를 기술한 문서. object 설계도.
 * - class 선언 : 기술하는 양식.
 * - 컴파일 과정을 통해 ~.class파일(bytecode)로 변환.
 * - jvm이 bytecode를 번역하면서 실행.
 * - instance : jvm에 의해서 실행된 결과.
 * - 객체지향 모델링 결과는 속성(data 요소 : variable)과 기능(행위 요소 : method).
 * - data 요소만 있는 class, 기능 요소만 있는 class, data 요소와 기능 요소를 모두 가지고 있는 class.
 * 
 * Object : 컴의 세계로 가져오려는 대상.
 * class : 컴의 세계로 가져오려는 대상에 대한 설계도(data와 기능). 자바 파일에 선언.
 * instance : class의 내용이 메모리에 올라간 상태.
 * class 하나로 무한대의 instance 생성 가능.
 * - class는 24평 아파트 설계도. -> 실제 아파트 수백채 이상 구현 가능.
 */
public class ClassOverView {

	public static void main(String[] args) {
		Class1Data data = new Class1Data();
		Class1Func func = new Class1Func();
		System.out.println("=====정렬 전=====");
		func.print(data.arr);
		func.arrange(data.arr);
		System.out.println("=====정렬 후=====");
		func.print(data.arr);
	}

}







