
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
		
		String str = "제품번호 : "+productnum+"\t제품명 :"+name+"\t가격 : "+price
				+"\t재고 : "+stock+"\t인치 : "+inch+"\t디스플레이 타입 : "+displayInfo;
		
		return str;
	}
	
}
