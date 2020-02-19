package hwjava06_����_12��_������;
import java.util.Arrays;
import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ProductMgr mgr = new ProductMgr();
		boolean f = true;
		while(f) {
			System.out.println(
					"1. ��ǰ���� (TV or Refrigerator) �� ����\n"+
					"2. ��ǰ���� ��ü�� �˻�\n" + 
					"3. ��ǰ��ȣ�� ��ǰ�� �˻�\n" + 
					"4. ��ǰ������ ��ǰ�� �˻�(��ǰ�� �κ� �˻� ����)\n" + 
					"5. TV ������ �˻�\n" + 
					"6. Refrigerator �� �˻�\n" + 
					"7. ��ǰ��ȣ�� ��ǰ�� ����\n" + 
					"8. ��ü ��� ��ǰ �ݾ�\n" +
					"0. ����");
			System.out.print("�Է� : ");
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
				System.out.println("��ȸ�ϰ� ���� ��ǰ��ȣ : ");
				String snum = sc.nextLine();
				System.out.println(mgr.searchNum(snum));
				break;
			case 4:
				System.out.println("��ȸ�ϰ� ���� ��ǰ�� : ");
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
				System.out.println("�����ϰ� ���� ��ǰ��ȣ : ");
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
