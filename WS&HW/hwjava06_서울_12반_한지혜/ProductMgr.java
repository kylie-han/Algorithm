package hwjava06_서울_12반_한지혜;

public class ProductMgr {
	private Product[] products = new Product[100];
	private int index;
	
	/**상품정보 (TV 와 Refrigerator) 를 객체 배열을 활용하여 저장
	 * @param p */
	public void add(Product p) {
		products[index++] = p;
	}
	/**상품정보 전체를 검색하는 기능*/
	public Product[] search() {
		Product[] productss = new Product[index];
		for (int i = 0; i < productss.length; i++) {
			productss[i] = products[i];
		}
		return productss;
	}
	/**상품번호로 상품을 검색하는 기능*/
	public Product searchNum(String num) {
		for (int i = 0; i < index; i++) {
			if(products[i].num.equals(num)) {
				return products[i];
			}
		}
		return null;
	}
	/**상품명으로 상품을 검색하는 기능 ,상품명 부분 검색 가능*/
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
	/**TV 정보만 검색*/
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
	/**Refrigerator 만 검색*/
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
	/**상품번호로 상품을 삭제하는 기능*/
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
	/**전체 재고 상품 금액을 구하는 기능*/
	public int stockPrice() {
		int sum = 0;
		for (int i = 0; i < index; i++) {
			sum += products[i].price*Integer.parseInt(products[i].stock);
		}
		return sum;
	}
	
}
