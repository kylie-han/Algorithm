import java.util.ArrayList;
import java.util.Iterator;

public class Collection3Iterator {

	public static void main(String[] args) {
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("hi");list3.add("hello");list3.add("how are you");list3.add("fine");list3.add("thanks");
		Iterator<String> it = list3.iterator();
		while(it.hasNext()) {//hasNext : 현재 커서 위치 다음 라인에 data가 있는지 문의.
			System.out.println(it.next());//커서를 다음 라인으로 이동시키고, 이동한 라인의 data를 추출.
		}
	}

}
