package chap4.base;

public class MovieTest {

	public static void main(String[] args) {
		Movie mv = new Movie();
		mv.title = "원피스";
		mv.director = "모름";
		mv.genre = "모험액션";
		mv.summary ="루피가 주인공.";
		mv.grade = 19;
		mv.movieInfo();
		String mInfo = mv.toString();
		System.out.println(mInfo);
		Movie mv2 = new Movie();
		mv2.title = "신의탑";
		mv2.director = "모름";
		mv2.genre = "성장모험액션";
		mv2.summary ="네버 엔딩 스토리.";
		mv2.grade = 19;
		mv2.movieInfo();
		System.out.println(mv2.toString());
	}

}
