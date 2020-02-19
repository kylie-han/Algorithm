package hwjava06_서울_12반_한지혜;

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
		return "Product [상품번호=" + num + ", 상품명=" + name + ", 가격=" + price + ", 재고=" + stock + "]";
	}
	
	
}
