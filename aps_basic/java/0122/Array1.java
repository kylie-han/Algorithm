
public class Array1 {

	public static void main(String[] args) {
		int [] iArr1;//선언
		iArr1 = new int[5];//생성
		System.out.println(iArr1.length);//길이는 5, 번지는 0에서 길이-1까지.
		iArr1[0]=1; iArr1[1]=10; iArr1[2] = 100;//대입
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i] + "\t");
		}
		int iArr2 [];//선언
		int iArr3 [] = {2,5,8,9,6,3};//선언과 생성을 동시에...
		//iArr2 = {1,4,7};//error
	}

}
