package com.ssafy;

public class MovieMgr {
	private static MovieMgr instance;

	private MovieMgr() {
		// TODO Auto-generated constructor stub
	}

	public static MovieMgr getInstance() {
		if (instance == null)
			instance = new MovieMgr();
		return instance;
	}

	private Movie[] movies = new Movie[100];
	private int index;

	/** 파라메터로 전달된 영화 정보를 전달받아 배열에 저장한다. */
	public void add(Movie m) {
		movies[index] = m;
		index++;
	}

	/** 배열에 저장된 모든 영화정보를 리턴한다. */
	public Movie[] search() {
		Movie[] moviess = new Movie[index];
		for (int i = 0; i < index; i++) {
			moviess[i] = movies[i];
		}
		return moviess;
	}

	/** 파라메터로 전달된 타이틀을 포함하고 있는 모든 영화 정보를 검색하여 리턴한다 */
	public Movie[] search(String title) {
		int cnt = 0;
		Movie[] moviest = new Movie[index];
		for (int i = 0; i < index; i++) {
			if(movies[i] == null) break;
			if (movies[i].getTitle().contains(title)) {
				moviest[cnt++] = movies[i];
			}
		}
		Movie[] moviesst = new Movie[cnt];
		for (int i = 0; i < moviesst.length; i++) {
			moviesst[i] = moviest[i];
		}
		return moviesst;
	}

	/** 파라메터로 전달된 감독명의 모든 영화 정보를 검색하여 리턴한다 */
	public Movie[] searchDirector(String name) {
		Movie[] moviesd = new Movie[movies.length];
		int cnt = 0;
		for (int i = 0; i < index; i++) {
			if(movies[i] == null) break;
			if(movies[i].getDirector() == name) {
				moviesd[cnt++] = movies[i]; 
			}
		}
		Movie[] moviessd = new Movie[cnt];
		for (int i = 0; i < cnt; i++) {
			moviessd[i] = moviesd[i];
		}
		return moviessd;
	}

	/** 파라메터로 전달된 장르의 모든 영화 정보를 검색하여 리턴한다 */
	public Movie[] searchGenre(String genre) {
		Movie[] moviesg = new Movie[movies.length];
		int cnt = 0;
		for (int i = 0; i < index; i++) {
			if(movies[i] == null) break;
			if(movies[i].getGenre().equals(genre)) {
				moviesg[cnt++] = movies[i]; 
			}
		}
		Movie[] moviessg = new Movie[cnt];
		for (int i = 0; i < cnt; i++) {
			moviessg[i] = moviesg[i];
		}
		return moviessg;	}

	/** 파라메터로 전달된 제목의 영화를 삭제한다. */
	public void delete(String title) {
		int cnt = 0;
		Movie[] moviest = new Movie[index];
		for (int i = 0; i < index; i++) {
			if(movies[i] == null) break;
			if (movies[i].getTitle() == title) {
				moviest[cnt++] = movies[i];
			}
		}
		Movie[] moviesst = new Movie[cnt];
		for (int i = 0; i < moviesst.length; i++) {
			moviesst[i] = moviest[i];
		}
		index--;
	}

	/** 저장된 영화 정보의 갯수를 리턴한다. */
	public int getSize() {
		return index;
	}
}
