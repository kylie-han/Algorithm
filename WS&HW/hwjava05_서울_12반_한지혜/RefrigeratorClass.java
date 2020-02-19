
public class RefrigeratorClass {
	String productnum;
	String name;
	String price;
	int stock;
	int volum;
	public RefrigeratorClass() {}
	public RefrigeratorClass(String productnum,	String name,String price,int stock,int volum) {
		this.productnum = productnum;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.volum = volum;
	}
	
	public String toString() {
		
		String str = "제품번호 : "+productnum+"\t제품명 :"+name+"\t가격 : "+price
				+"\t재고 : "+stock+"\t용량 : "+volum;
		
		return str;
	}
}
