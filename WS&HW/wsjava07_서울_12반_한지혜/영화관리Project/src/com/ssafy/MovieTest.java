package com.ssafy;


import java.util.Arrays;
import java.util.Scanner;

public class MovieTest {
//	static File file = new File("src/input.txt");
	public static void main(String[] args) {
		MovieMgr mgr = MovieMgr.getInstance();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1. ��ȭ ���� �Է�\n"
							 + "2. ��ȭ ���� ��ü �˻�\n"
							 + "3. ��ȭ�� �˻�\n"
							 + "4. ��ȭ �帣�� �˻�\n"
							 + "5. ��ȭ ���� ����\n"
							 + "0. ����"
							 + "���ϴ� ��ȣ�� �����ϼ���. _\r");
			
			int num = Integer.parseInt(sc.nextLine());
			if (num == 0)
				break;
			else if (num == 1) {
				System.out.println("1. ��ȭ ���� �Է�");
				System.out.print("���� : ");
				String title = sc.nextLine();
				System.out.print("���� : ");
				String director = sc.nextLine();
				System.out.print("��� : ");
				int grade = Integer.parseInt(sc.nextLine());
				System.out.print("�帣 : ");
				String genre = sc.nextLine();
				System.out.print("���� : ");
				String summary = sc.nextLine();
				
				Movie m = new Movie(title, director, grade, genre, summary);
				mgr.add(m);
			} else if (num == 2) {
				System.out.println("2. ��ȭ ���� ��ü �˻�");
				System.out.println(Arrays.toString(mgr.search()));
			} else if (num == 3) {
				System.out.println("3. ��ȭ�� �˻�");
				System.out.print("���� :");
				String title = sc.nextLine();
				System.out.println(Arrays.toString(mgr.search(title)));
			} else if (num == 4) {
				System.out.println("4. ��ȭ �帣�� �˻�");
				System.out.print("�帣 :");
				String genre = sc.nextLine();
				System.out.println(Arrays.toString(mgr.searchGenre(genre)));
			} else if (num == 5) {
				System.out.println("5. ��ȭ ���� ����");
				System.out.print("���� :");
				String title = sc.nextLine();
				mgr.delete(title);
			} else continue;
		}
	}
}
