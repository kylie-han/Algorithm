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

	/** �Ķ���ͷ� ���޵� ��ȭ ������ ���޹޾� �迭�� �����Ѵ�. */
	public void add(Movie m) {
		movies[index] = m;
		index++;
	}

	/** �迭�� ����� ��� ��ȭ������ �����Ѵ�. */
	public Movie[] search() {
		Movie[] moviess = new Movie[index];
		for (int i = 0; i < index; i++) {
			moviess[i] = movies[i];
		}
		return moviess;
	}

	/** �Ķ���ͷ� ���޵� Ÿ��Ʋ�� �����ϰ� �ִ� ��� ��ȭ ������ �˻��Ͽ� �����Ѵ� */
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

	/** �Ķ���ͷ� ���޵� �������� ��� ��ȭ ������ �˻��Ͽ� �����Ѵ� */
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

	/** �Ķ���ͷ� ���޵� �帣�� ��� ��ȭ ������ �˻��Ͽ� �����Ѵ� */
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

	/** �Ķ���ͷ� ���޵� ������ ��ȭ�� �����Ѵ�. */
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

	/** ����� ��ȭ ������ ������ �����Ѵ�. */
	public int getSize() {
		return index;
	}
}
