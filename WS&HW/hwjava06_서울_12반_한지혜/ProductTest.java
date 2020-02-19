package hwjava06_서울_12반_한지혜;
import java.util.Arrays;
import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ProductMgr mgr = new ProductMgr();
		boolean f = true;
		while(f) {
			System.out.println(
					"1. 상품정보 (TV or Refrigerator) 를 저장\n"+
					"2. 상품정보 전체를 검색\n" + 
					"3. 상품번호로 상품을 검색\n" + 
					"4. 상품명으로 상품을 검색(상품명 부분 검색 가능)\n" + 
					"5. TV 정보만 검색\n" + 
					"6. Refrigerator 만 검색\n" + 
					"7. 상품번호로 상품을 삭제\n" + 
					"8. 전체 재고 상품 금액\n" +
					"0. 종료");
			System.out.print("입력 : ");
			int i = Integer.parseInt(sc.nextLine());
			switch (i) {
			case 1:
				Product p = new Product();
				System.out.println("TV or Refrigerator : ");
				String type = sc.nextLine();
				System.out.println("Product number : ");
				String num = sc.nextLine(); 
				System.out.println("Product name : ");
				String name = sc.nextLine(); 
				System.out.println("Product price : ");
				int price = Integer.parseInt(sc.nextLine());   
				System.out.println("Product stock : ");
				String stock = sc.nextLine();
				if(type.equals("TV")) {
					System.out.println("display size : ");
					String inch = sc.nextLine();
					p = new TV(num, name, price, stock, inch);
				}else {
					System.out.println("Refrigerator capacity : ");
					String liter = sc.nextLine();
					p = new Refrigerator(num, name, price, stock, liter);
				}
				mgr.add(p);
				break;
			case 2:
				System.out.println(Arrays.toString(mgr.search()));
				break;
			case 3:
				System.out.println("조회하고 싶은 제품번호 : ");
				String snum = sc.nextLine();
				System.out.println(mgr.searchNum(snum));
				break;
			case 4:
				System.out.println("조회하고 싶은 제품명 : ");
				String sname = sc.nextLine();
				System.out.println(Arrays.toString(mgr.searchName(sname)));
				break;
			case 5:
				System.out.println(Arrays.toString(mgr.searchTV()));
				break;
			case 6:
				System.out.println(Arrays.toString(mgr.searchRef()));
				break;
			case 7:
				System.out.println("삭제하고 싶은 제품번호 : ");
				String dnum = sc.nextLine();
				mgr.delete(dnum);;
				break;
			case 8:
				System.out.println(mgr.stockPrice());
				break;

			default:
				f = false;
				break;
			}
			
		}
	}


	
}
