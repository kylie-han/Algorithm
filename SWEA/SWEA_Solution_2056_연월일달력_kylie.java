import java.util.Scanner;

public class SWEA_Solution_2056_연월일달력_kylie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			int date = sc.nextInt();
			int year = date/10000;
			int month = (date%10000)/100;
			int day = date%100;
			int err = 0;
			//에러인 경우
			if (month <= 0 || month > 12) err++;
			if (day<=0) err++;
			else if (day>30 && (month==4 || month==6 || month==9 || month==11)) err++;
			else if(day>28 && month==2) err++;
			else if(day>31 && (month==1||month==3||month==5||month==7||month==8||month==10||month==12)) err++;
			//출력
			if (err==0) System.out.printf("#%d %04d/%02d/%02d\n",testCase,year,month,day);
			else System.out.println("#"+testCase+" "+ -1);
		}
	}
}
