
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
		
		String str = "��ǰ��ȣ : "+productnum+"\t��ǰ�� :"+name+"\t���� : "+price
				+"\t��� : "+stock+"\t�뷮 : "+volum;
		
		return str;
	}
}
