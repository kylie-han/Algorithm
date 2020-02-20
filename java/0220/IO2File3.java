import java.io.File;
import java.util.ArrayList;

public class IO2File3 {
	static ArrayList<File> list = new ArrayList<File>();
	public static void main(String[] args) {
		File file = new File("C:\\SSAFY_INS\\upload_workshop_java");
		//위에 지정된 폴더 내의 모든 파일과 폴더를 리스트 하시오.
		//폴더는 그 하위까지 모두 검색 하시오.
		addList(file);
		for(int i=0; i<list.size(); i++) {
			File tmp = list.get(i);
			if(tmp.isDirectory()) {
				addList(tmp);
			}
		}
		for(File tmp : list) {
			System.out.println(tmp);
		}
	}
	public static void addList(File dir) {
		File [] fArr = dir.listFiles();
		for(File tmp : fArr) {
			list.add(tmp);
		}
	}

}
