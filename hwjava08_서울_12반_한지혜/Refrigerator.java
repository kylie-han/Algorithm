

public class Refrigerator extends Product{
	public int liter;
	public Refrigerator() {
		// TODO Auto-generated constructor stub
	}
	public Refrigerator(String num, String name, int price, String stock, int liter) {
		super(num, name, price, stock);
		this.liter = liter;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString().replace("Product", "Refrigerator").replace("]", ",") + "liter=" + liter + "]";
	}
	
}
