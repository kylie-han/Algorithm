/*
 * Heterogeneous Collection
 * Homogeneous Collection
 */
public class Inherit5Hetero {

	public static void main(String[] args) {
		String [] sArr = new String[10];
		sArr[0] = new String("hi");
		//Homogeneous Collection : 같은 종류의 data type을 저장하는 구조.
		TmpPolyChild1 [] childArr1 = new TmpPolyChild1[10];////Homogeneous Collection
		childArr1[0] = new TmpPolyChild1();
		//childArr1[1] = new TmpPolyChild2();//error
		//childArr1[2] = new TmpPolyParent();//error
		TmpPolyParent [] pArr = new TmpPolyParent[10];
		pArr[0] = new TmpPolyParent();
		pArr[1] = new TmpPolyChild1();
		pArr[2] = new TmpPolyChild2();
		//Heterogeneous Collection : 부모 class type으로 정의된 배열에는 모든 자식 class type의 객체가 들어갈 수 있다.
	}

}











