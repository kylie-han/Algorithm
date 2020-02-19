import java.util.ArrayList;

public class IProductMgr implements ProductMgrImpl{
	ArrayList<Product> list = new ArrayList<>();

	@Override
	public void add(Product p) {
		list.add(p);
	}

	@Override
	public ArrayList<Product> search() {
		return list;
	}

	@Override
	public Product searchNum(String num) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).num.equals(num));
			return list.get(i);
		}
		return null;
	}

	@Override
	public ArrayList<Product> searchName(String name) {
		ArrayList<Product> sn = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).name.contains(name)) {
				sn.add(list.get(i));
			}
		}
		return sn;
	}

	@Override
	public ArrayList<Product> searchTV() {
		ArrayList<Product> st = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof TV) {
				st.add(list.get(i));
			}
		}
		return st;
	}

	@Override
	public ArrayList<Product> searchRef() {
		ArrayList<Product> sr = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Refrigerator) {
				sr.add(list.get(i));
			}
		}
		return sr;
	}

	@Override
	public ArrayList<Product> searchMoreThan400L() {
		ArrayList<Product> smtl = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Refrigerator) {
				Refrigerator r = (Refrigerator)list.get(i);
				if (r.liter >= 400) {
					smtl.add(r);
				}
			}
		}
		return smtl;
	}

	@Override
	public ArrayList<Product> searchMoreThan50Inch() {
		ArrayList<Product> smti = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof TV) {
				TV t = (TV)list.get(i);
				if (t.inch >= 50) {
					smti.add(t);
				}
			}
		}
		return smti;
	}
	
	@Override
	public void modifyPrice(String num, int price) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).num.equals(num)) {
				list.get(i).price = price;
			}
		}
	}

	@Override
	public void delete(String num) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).num.equals(num)) {
				list.remove(i);
			}
		}
	}

	@Override
	public int stockPrice() {
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i).price;
		}
		return total;
	}
	
}
