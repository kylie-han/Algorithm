package chap4.base;

public class MovieTest {

	public static void main(String[] args) {
		Movie mv = new Movie();
		mv.title = "���ǽ�";
		mv.director = "��";
		mv.genre = "����׼�";
		mv.summary ="���ǰ� ���ΰ�.";
		mv.grade = 19;
		mv.movieInfo();
		String mInfo = mv.toString();
		System.out.println(mInfo);
		Movie mv2 = new Movie();
		mv2.title = "����ž";
		mv2.director = "��";
		mv2.genre = "�������׼�";
		mv2.summary ="�׹� ���� ���丮.";
		mv2.grade = 19;
		mv2.movieInfo();
		System.out.println(mv2.toString());
	}

}
