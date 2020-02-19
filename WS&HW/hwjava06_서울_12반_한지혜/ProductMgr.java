package hwjava06_����_12��_������;

public class ProductMgr {
	private Product[] products = new Product[100];
	private int index;
	
	/**��ǰ���� (TV �� Refrigerator) �� ��ü �迭�� Ȱ���Ͽ� ����
	 * @param p */
	public void add(Product p) {
		products[index++] = p;
	}
	/**��ǰ���� ��ü�� �˻��ϴ� ���*/
	public Product[] search() {
		Product[] productss = new Product[index];
		for (int i = 0; i < productss.length; i++) {
			productss[i] = products[i];
		}
		return productss;
	}
	/**��ǰ��ȣ�� ��ǰ�� �˻��ϴ� ���*/
	public Product searchNum(String num) {
		for (int i = 0; i < index; i++) {
			if(products[i].num.equals(num)) {
				return products[i];
			}
		}
		return null;
	}
	/**��ǰ������ ��ǰ�� �˻��ϴ� ��� ,��ǰ�� �κ� �˻� ����*/
	public Product[] searchName(String name) {
		Product[] productsn = new Product[index];
		int idx = 0;
		for (int i = 0; i < index; i++) {
			if(products[i].name.contains(name)) {
				productsn[idx++] = products[i];
			}
		}
		Product[] productssn = new Product[productsn.length];
		for (int i = 0; i < productsn.length; i++) {
			productssn[i] = productsn[i];
		}
				
		return productssn;
	}
	/**TV ������ �˻�*/
	public Product[] searchTV() {
		Product[] productt = new Product[index];
		int idx = 0;
		for (int i = 0; i < index; i++) {
			if(products[i] instanceof TV) {
				productt[idx++] = products[i];
			}
		}
		Product[] productst = new Product[productt.length];
		for (int i = 0; i < productt.length; i++) {
			productst[i] = productt[i];
		}
		return productst;
	}
	/**Refrigerator �� �˻�*/
	public Product[] searchRef() {
		Product[] productr = new Product[index];
		int idx = 0;
		for (int i = 0; i < index; i++) {
			if(products[i] instanceof Refrigerator) {
				productr[idx++] = products[i];
			}
		}
		Product[] productsr = new Product[productr.length];
		for (int i = 0; i < productr.length; i++) {
			productsr[i] = productr[i];
		}
		return productsr;
	}
	/**��ǰ��ȣ�� ��ǰ�� �����ϴ� ���*/
	public void delete(String num) {
		for (int i = 0; i < index; i++) {
			if(products[i].num.equals(num)) {
				for (int j = i; j < index; j++) {
					products[j] = products[j+1];
				}
				index--;
			}
		}
	}
	/**��ü ��� ��ǰ �ݾ��� ���ϴ� ���*/
	public int stockPrice() {
		int sum = 0;
		for (int i = 0; i < index; i++) {
			sum += products[i].price*Integer.parseInt(products[i].stock);
		}
		return sum;
	}
	
}
