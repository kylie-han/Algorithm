/*
 * Heterogeneous Collection
 * Homogeneous Collection
 */
public class Inherit5Hetero {

	public static void main(String[] args) {
		String [] sArr = new String[10];
		sArr[0] = new String("hi");
		//Homogeneous Collection : ���� ������ data type�� �����ϴ� ����.
		TmpPolyChild1 [] childArr1 = new TmpPolyChild1[10];////Homogeneous Collection
		childArr1[0] = new TmpPolyChild1();
		//childArr1[1] = new TmpPolyChild2();//error
		//childArr1[2] = new TmpPolyParent();//error
		TmpPolyParent [] pArr = new TmpPolyParent[10];
		pArr[0] = new TmpPolyParent();
		pArr[1] = new TmpPolyChild1();
		pArr[2] = new TmpPolyChild2();
		//Heterogeneous Collection : �θ� class type���� ���ǵ� �迭���� ��� �ڽ� class type�� ��ü�� �� �� �ִ�.
	}

}











