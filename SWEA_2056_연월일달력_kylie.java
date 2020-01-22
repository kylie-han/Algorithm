import java.util.Scanner;

public class SWEA_2056_연월일달력_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			int err = 0;
			String date = sc.next();//값을 문자열로 받았는데 값이 숫자뿐이니까 굳이 문자열로 받지 말고 숫자에서 뽑아내는거 생각해보기*
			if (date.length() > 8) err++;
			
			String year_s = date.substring(0, 4);//date[0]~[3] :년
			int year = Integer.parseInt(year_s);
			if (year <= 0) err++;
			
			String month_s = date.substring(4, 6);//date[4]~[5] :월
			int month = Integer.parseInt(month_s);
			if(month>12 || month<=0) err++;
			
			String day_s = date.substring(6, 8);//date[6]~[7] :일
			int day = Integer.parseInt(day_s);
			if(day<=0) err++;
			if(day>31 || (month==2 && day>28) || ((month==4 || month==6 || month==9 ||month==11)&&(day>30)) || day<1 || month<1 ||month>12){
				err++;
            }
//			switch(month) {
//			case 1: if(day <= 31) break;
//					err++;
//			case 2: if(day <= 28) break;
//					err++;
//			case 3: if(day <= 31) break;
//					err++;
//			case 4: if(day <= 30) break;
//					err++;
//			case 5: if(day <= 31) break;
//					err++;
//			case 6: if(day <= 30) break;
//					err++;
//			case 7: if(day <= 31) break;
//					err++;
//			case 8: if(day <= 31) break;
//					err++;
//			case 9: if(day <= 30) break;
//					err++;
//			case 10: if(day <= 31) break;
//					err++;
//			case 11: if(day <= 30) break;
//					err++;
//			case 12: if(day <= 31) break;
//					err++;
//			}
//			System.out.println(Integer.parseInt(day));
			//결과값 출력
			if(err == 0) System.out.printf("#%d %04d/%02d/%02d\n",testCase,year,month,day);
			else System.out.printf("#%d -1\n",testCase);
		}//for(testcase만큼 반복)
	}//main
}//class
