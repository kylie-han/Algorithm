import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		//Calendar cal = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));//1(일) 2 3 4(수) 5 6 7(토)
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
//		Date date = new Date();
//		System.out.println(date);
//		System.out.println(date.getYear());
//		System.out.println(date.getMonth()+1);//0~11
//		System.out.println(date.getDate());
//		System.out.println(date.getDay());//0(일) 1 2 3(수) 4 5 6(토)
//		System.out.println(date.getHours());
//		System.out.println(date.getMinutes());
//		System.out.println(date.getSeconds());
	}

}
