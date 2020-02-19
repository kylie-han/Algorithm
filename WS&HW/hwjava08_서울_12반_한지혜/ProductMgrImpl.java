import java.util.ArrayList;

public interface ProductMgrImpl {
	/** 1. ��ǰ����(TV�� Refrigerator)�� ����*/
	public void add(Product p);
	/** 2. ��ǰ���� ��ü�� �˻��ϴ� ���*/
	public ArrayList<Product> search();
	/** 3. ��ǰ��ȣ�� ��ǰ�� �˻��ϴ� ���*/
	public Product searchNum(String num);
	/** 4. ��ǰ������ ��ǰ�� �˻��ϴ� ���(��ǰ�� �κ� �˻� ����)*/
	public ArrayList<Product> searchName(String name);
	/** 5. TV������ �˻�*/
	public ArrayList<Product> searchTV();
	/** 6. Refrigerator�� �˻�*/
	public ArrayList<Product> searchRef();
	/** 7. 400L �̻��� Refrigerator �˻�*/
	public ArrayList<Product> searchMoreThan400L();
	/** 8. 50inch �̻��� TV�˻�*/
	public ArrayList<Product> searchMoreThan50Inch();
	/** 9. ��ǰ��ȣ�� ������ �Է� �޾� ��ǰ ������ ������ �� �ִ� ���*/
	public void modifyPrice(String num, int price);
	/** 10. ��ǰ��ȣ�� ��ǰ�� �����ϴ� ���*/
	public void delete(String num);
	/** 11. ��ü ��� ��ǰ �ݾ��� ���ϴ� ���*/
	public int stockPrice();
}
