import java.io.File;

public class IO2File2 {

	public static void main(String[] args) {
		File file = new File("C:\\SSAFY");
		System.out.println("canRead : "+file.canRead());
		System.out.println("canWrite : "+file.canWrite());
		System.out.println("canExecute : "+file.canExecute());
		System.out.println("isDirectory : "+file.isDirectory());
		System.out.println("isFile : "+file.isFile());
		System.out.println("getAbsolutePath : "+file.getAbsolutePath());
		System.out.println("getParent : "+file.getParent());
		System.out.println("getPath : "+file.getPath());
		System.out.println("getName : "+file.getName());
		String [] ssafyDir = file.list();
//		for(String name : ssafyDir) {
//			System.out.println(name);
//		}
		File [] ssafyDir2 = file.listFiles();
		for(File tmp : ssafyDir2) {
			System.out.println(tmp);
		}
	}//main

}
