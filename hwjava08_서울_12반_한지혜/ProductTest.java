
import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		IProductMgr mgr = new IProductMgr();
		boolean f = true;
		while(f) {
			System.out.println(
					"1. 상품정보 (TV or Refrigerator) 를 저장\n"+
					"2. 상품정보 전체를 검색\n" + 
					"3. 상품번호로 상품을 검색\n" + 
					"4. 상품명으로 상품을 검색(상품명 부분 검색 가능)\n" + 
					"5. TV 정보만 검색\n" + 
					"6. Refrigerator 만 검색\n" + 
					"7. 400L 이상의 Refrigerator 검색\n"+
					"8. 50inch 이상의 TV검색\n"+
					"9. 상품번호와 가격을 입력 받아 상품 가격을 변경할 수 있는 기능\n"+
					"10. 상품번호로 상품을 삭제\n" + 
					"11. 전체 재고 상품 금액\n" +
					"0. 종료");
			System.out.print("입력 : ");
			int i = Integer.parseInt(sc.nextLine());
//			System.out.print(i+" : ");
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
					int inch = Integer.parseInt(sc.nextLine());
					p = new TV(num, name, price, stock, inch);
				}else {
					System.out.println("Refrigerator capacity : ");
					int liter = Integer.parseInt(sc.nextLine());
					p = new Refrigerator(num, name, price, stock, liter);
				}
				mgr.add(p);
				break;
			case 2:
				System.out.println(mgr.search());
				break;
			case 3:
				System.out.println("조회하고 싶은 제품번호 : ");
				String snum = sc.nextLine();
				System.out.println(mgr.searchNum(snum));
				break;
			case 4:
				System.out.println("조회하고 싶은 제품명 : ");
				String sname = sc.nextLine();
				System.out.println(mgr.searchName(sname));
				break;
			case 5:
				System.out.println(mgr.searchTV());
				break;
			case 6:
				System.out.println(mgr.searchRef());
				break;
			case 7:
				System.out.println(mgr.searchMoreThan400L());
				break;
			case 8:
				System.out.println(mgr.searchMoreThan50Inch());
				break;
			case 9:
				System.out.println("가격을 변경하고 싶은 제품의 번호와 변경할 가격을 입력하세요.");
				System.out.println("번호 : ");
				num = sc.nextLine(); 
				System.out.println("가격 : ");
				price = Integer.parseInt(sc.nextLine()); 
				mgr.modifyPrice(num, price);
				break;
			case 10:
				System.out.println("삭제하고 싶은 제품번호 : ");
				String dnum = sc.nextLine();
				mgr.delete(dnum);;
				break;
			case 11:
				System.out.println(mgr.stockPrice());
				break;

			default:
				f = false;
				break;
			}
			
		}
	}


	
}
