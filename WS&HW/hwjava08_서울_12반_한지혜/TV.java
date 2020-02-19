

public class TV extends Product{
	public int inch;
	public TV() {
		// TODO Auto-generated constructor stub
	}
	public TV(String num, String name, int price, String stock, int inch) {
		super(num, name, price, stock);
		this.inch = inch;
	}
	@Override
	public String toString() {
		return super.toString().replace("Product", "TV").replace("]", ",") + "inch=" + inch + "]";
	}
}
