import java.util.ArrayList;

public interface ProductMgrImpl {
	/** 1. 상품정보(TV와 Refrigerator)를 저장*/
	public void add(Product p);
	/** 2. 상품정보 전체를 검색하는 기능*/
	public ArrayList<Product> search();
	/** 3. 상품번호로 상품을 검색하는 기능*/
	public Product searchNum(String num);
	/** 4. 상품명으로 상품을 검색하는 기능(상품명 부분 검색 가능)*/
	public ArrayList<Product> searchName(String name);
	/** 5. TV정보만 검색*/
	public ArrayList<Product> searchTV();
	/** 6. Refrigerator만 검색*/
	public ArrayList<Product> searchRef();
	/** 7. 400L 이상의 Refrigerator 검색*/
	public ArrayList<Product> searchMoreThan400L();
	/** 8. 50inch 이상의 TV검색*/
	public ArrayList<Product> searchMoreThan50Inch();
	/** 9. 상품번호와 가격을 입력 받아 상품 가격을 변경할 수 있는 기능*/
	public void modifyPrice(String num, int price);
	/** 10. 상품번호로 상품을 삭제하는 기능*/
	public void delete(String num);
	/** 11. 전체 재고 상품 금액을 구하는 기능*/
	public int stockPrice();
}
