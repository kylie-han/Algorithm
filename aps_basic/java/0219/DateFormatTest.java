import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
		Date date = new Date();
//		System.out.println(date);

//		DateFormat format_nalja = new SimpleDateFormat("YYYY-MM-dd");
		DateFormat format_nalja = new SimpleDateFormat("YYYY_MM_dd");
		String nalja = format_nalja.format(date);
		System.out.println(nalja);

//		DateFormat format_sigan = new SimpleDateFormat("HH:mm:ss");
		DateFormat format_sigan = new SimpleDateFormat("HHmmss");
		String sigan = format_sigan.format(date);
		System.out.println(sigan);

		String fileName = "FinalTest.java";
		String fileName1 = fileName.substring(0,fileName.lastIndexOf("."));
		String fileName2 = fileName.substring(fileName.lastIndexOf("."));
		System.out.println(fileName1+"_"+sigan+fileName2);
	}

}
