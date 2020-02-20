
public class Array2 {

	public static void main(String[] args) {
		int [] iArr1 = {1,2,3,4,5,6,7,8,9};
		int [] iArr2 = {999,888,777};
		int [] iArr3 = new int [12];
		//System.arraycopy(iArr1, 0, iArr3, 0, iArr1.length);
		System.arraycopy(iArr1, 0, iArr3, 0, 5);
		System.arraycopy(iArr2, 0, iArr3, 9, iArr2.length);
		for(int i=0; i<iArr3.length; i++) {
			System.out.print(iArr3[i] + " ");
		}
	}

}
