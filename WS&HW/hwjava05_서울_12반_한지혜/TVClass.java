
public class TVClass {
	String productnum;
	String name;
	String price;
	int stock;
	int inch;
	String displayInfo;
	public TVClass(){}
	public TVClass(String productnum,String name,String price,int stock,int inch,String displayInfo) {
		this.productnum = productnum;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.inch = inch;
		this.displayInfo = displayInfo;
	}
	public String toString() {
		
		String str = "��ǰ��ȣ : "+productnum+"\t��ǰ�� :"+name+"\t���� : "+price
				+"\t��� : "+stock+"\t��ġ : "+inch+"\t���÷��� Ÿ�� : "+displayInfo;
		
		return str;
	}
	
}
