import java.io.File;
import java.util.ArrayList;

public class IOFile {
	static ArrayList<File> list = new ArrayList<File>();
	public static void main(String[] args) {
		File file = new File("C:\\ssafy\\repo\\java");
		addList(file);
		for (int i = 0; i < list.size(); i++) {
			File tmp = list.get(i);
			if(tmp.isDirectory()) {
				addList(tmp);
			}
		}
		for (File tmp : list) {
			System.out.println(tmp);
		}
	}
	public static void addList(File dir) {
		File[] fArr = dir.listFiles();
		for (File tmp : fArr) {
			list.add(tmp);
		}
	}
}
