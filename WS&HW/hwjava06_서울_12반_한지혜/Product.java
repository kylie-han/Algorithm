package hwjava06_����_12��_������;

public class Product {
	public String num;
	public String name;
	public int price;
	public String stock;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String num, String name, int price, String stock) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [��ǰ��ȣ=" + num + ", ��ǰ��=" + name + ", ����=" + price + ", ���=" + stock + "]";
	}
	
	
}
