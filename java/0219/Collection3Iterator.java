import java.util.ArrayList;
import java.util.Iterator;

public class Collection3Iterator {

	public static void main(String[] args) {
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("hi");list3.add("hello");list3.add("how are you");list3.add("fine");list3.add("thanks");
		Iterator<String> it = list3.iterator();
		while(it.hasNext()) {//hasNext : ���� Ŀ�� ��ġ ���� ���ο� data�� �ִ��� ����.
			System.out.println(it.next());//Ŀ���� ���� �������� �̵���Ű��, �̵��� ������ data�� ����.
		}
	}

}
