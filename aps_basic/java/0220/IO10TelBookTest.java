import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class IO10TelBookTest {
	ArrayList<OOTestVO> list = null;
	Scanner scan = null;
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	FileInputStream fis = null;
	ObjectInputStream ois = null;
	IO10TelBookTest(){
		try {
			File outFile = new File(new File(".").getCanonicalPath()+"\\src\\telbook.obj");
			list = new ArrayList<OOTestVO>();
			fis = new FileInputStream(outFile);
			ois = new ObjectInputStream(fis);
			loadTelBook();
			fos = new FileOutputStream(outFile);
			oos = new ObjectOutputStream(fos);
			scan = new Scanner(System.in);
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("��ȭ ��ȣ�� ���� ����.");
			e.printStackTrace();
		}
	}
	private void loadTelBook() throws ClassNotFoundException, IOException {
		OOTestVO tmpVO2 = null;
		try {
			tmpVO2 = (OOTestVO) ois.readObject();
		} catch (EOFException e) {
		}
		while(	tmpVO2 != null	) {
			try {
				list.add(tmpVO2);
				tmpVO2 = (OOTestVO) ois.readObject();
			} catch (EOFException e) {
				break;
			}
		}
	}
	private void saveTelBook() {
		for(OOTestVO vo : list) {
			try {
				oos.writeObject(vo);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	private void closeTelBook() {
		scan.close();
		try {
			oos.close();
			fos.close();
			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void insertList() {
		System.out.print("�̸� : ");
		String strName = scan.next();
		System.out.print("��ȭ��ȣ : ");
		String strTel = scan.next();
		list.add(new OOTestVO(strName, strTel));
	}
	private void printList() {
		for(OOTestVO vo : list) {
			System.out.println(vo);
		}
	}
	public static void main(String[] args) {
		//Object Stream�� �̿��Ͽ�, ��ȭ��ȣ�θ� ����ÿ�.//�Է� ��¸� ����.
		IO10TelBookTest telBook = new IO10TelBookTest();
		System.out.println("==========��ȭ ��ȣ��==========");
		int menuNo = 0;
		while(true) {
			System.out.print("0:����, 1:�Է�, 2:���, ���� : ");
			menuNo = telBook.scan.nextInt();
			if(menuNo == 0) {
				telBook.saveTelBook();
				telBook.closeTelBook();
				break;
			} else if(menuNo == 1) {
				telBook.insertList();
			} else if(menuNo == 2) {
				telBook.printList();
			}
		}//while
	}//main

}//class

