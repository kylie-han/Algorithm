import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		ArrayList<String> strArr = new ArrayList<String>();
		strArr.add("first");strArr.add("22222");strArr.add("third");
		System.out.println(strArr);
		for(int i=0; i<strArr.size(); i++) {
			System.out.println(strArr.get(i));
		}
		System.out.println("==========");
		for(String tmpStr : strArr) {
			System.out.println(tmpStr);
		}
		System.out.println("==========");
		int [] intArr = {1,5,9,7,5,3,5};
		int sum = 0;
		for(int tmpInt : intArr) {
			sum += tmpInt;
		}
		System.out.println("sum : " + sum);
	}//main

}
