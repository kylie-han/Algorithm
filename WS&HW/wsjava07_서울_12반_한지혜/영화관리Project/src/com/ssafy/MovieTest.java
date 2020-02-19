package com.ssafy;


import java.util.Arrays;
import java.util.Scanner;

public class MovieTest {
//	static File file = new File("src/input.txt");
	public static void main(String[] args) {
		MovieMgr mgr = MovieMgr.getInstance();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1. 영화 정보 입력\n"
							 + "2. 영화 정보 전체 검색\n"
							 + "3. 영화명 검색\n"
							 + "4. 영화 장르별 검색\n"
							 + "5. 영화 정보 삭제\n"
							 + "0. 종료"
							 + "원하는 번호를 선택하세요. _\r");
			
			int num = Integer.parseInt(sc.nextLine());
			if (num == 0)
				break;
			else if (num == 1) {
				System.out.println("1. 영화 정보 입력");
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("감독 : ");
				String director = sc.nextLine();
				System.out.print("등급 : ");
				int grade = Integer.parseInt(sc.nextLine());
				System.out.print("장르 : ");
				String genre = sc.nextLine();
				System.out.print("내용 : ");
				String summary = sc.nextLine();
				
				Movie m = new Movie(title, director, grade, genre, summary);
				mgr.add(m);
			} else if (num == 2) {
				System.out.println("2. 영화 정보 전체 검색");
				System.out.println(Arrays.toString(mgr.search()));
			} else if (num == 3) {
				System.out.println("3. 영화명 검색");
				System.out.print("제목 :");
				String title = sc.nextLine();
				System.out.println(Arrays.toString(mgr.search(title)));
			} else if (num == 4) {
				System.out.println("4. 영화 장르별 검색");
				System.out.print("장르 :");
				String genre = sc.nextLine();
				System.out.println(Arrays.toString(mgr.searchGenre(genre)));
			} else if (num == 5) {
				System.out.println("5. 영화 정보 삭제");
				System.out.print("제목 :");
				String title = sc.nextLine();
				mgr.delete(title);
			} else continue;
		}
	}
}
