/**부분집합
 * 
 * 어떤 집합의 모든 부분집합을 원소로 하는 집합 : 멱집합 Powerset
 * @author multicampus
 *
 */
public class Z08_subset {
	public static void main(String[] args) {
		int[] a = {-7,-3,-2,5,8};
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					for (int l = 0; l < 2; l++) {
						for (int m = 0; m < 2; m++) {
							int sum = 0;
							if (i==1) sum += a[0];
							if (j==1) sum += a[1];
							if (k==1) sum += a[2];
							if (l==1) sum += a[3];
							if (m==1) sum += a[4];
							
							//합이 0일 경우 부분집합을 출력하시오
							if (sum == 0) {
								if (i==1) System.out.print(a[0]+" ");
								if (j==1) System.out.print(a[1]+" ");
								if (k==1) System.out.print(a[2]+" ");
								if (l==1) System.out.print(a[3]+" ");
								if (m==1) System.out.print(a[4]+" ");
								System.out.println();
							}
						}
					}
				}
			}
		}
		//바이너리 카운팅
		int[] b = {3,4,5,6};
//		모든 부분집합을 구하기 위해서 원소가 4개니까 4개 비트가 필요함, 0-15 숫자를 비트마스킹을 통해 원소를 넣을지 결정
		for (int i = 0; i < (1<<b.length); i++) {//1<<n: 부분집합의 개수
			System.out.printf("%2d :   ",i);
			for (int j = 0; j < b.length; j++) {
				if ((i & (1<<j)) != 0) System.out.print(b[j]+",");
			}
//			if ((i & (1<<0)) != 0) System.out.print(b[0]+",");
//			if ((i & (1<<1)) != 0) System.out.print(b[1]+",");
//			if ((i & (1<<2)) != 0) System.out.print(b[2]+",");
//			if ((i & (1<<3)) != 0) System.out.print(b[3]+",");
			System.out.println();
		}
	}//end of main
}//end of class

//for (int j = 0; j < n; j++) {//원소의 수만큼 비트를 비교함
//	if (i & (1<<j)) {//i의j번째 비트가 1이면 j번째 원소 출력
//		System.out.println("%d, ", b[j]);
//	}	
//}		