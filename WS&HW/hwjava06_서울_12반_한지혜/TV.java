package hwjava06_서울_12반_한지혜;

public class TV extends Product{
	public String inch;
	public TV() {
		// TODO Auto-generated constructor stub
	}
	public TV(String num, String name, int price, String stock, String inch) {
		super(num, name, price, stock);
		this.inch = inch;
	}
	@Override
	public String toString() {
		return super.toString().replace("Product", "TV").replace("]", ",") + "inch=" + inch + "]";
	}
}
