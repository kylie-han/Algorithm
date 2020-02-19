package com.ssafy;

public class CarMgr {
	private static CarMgr instance;

	private CarMgr() {
	}

	public static CarMgr getInstance() {
		if (instance == null) {
			instance = new CarMgr();
		}
		return instance;
	}

	private Car[] cars = new Car[100];
	private int index;

	/** O파라메터로 전달된 차량 정보를 배열에 저장한다 */
	public void add(Car c) {
		cars[index] = c;
		index++;
	}

	/** O현재 저장된 모든 차량 정보를 리턴한다 */
	public Car[] search() {
		Car[] carss = new Car[index];
		for (int i = 0; i < index; i++) {
			carss[i] = cars[i];
		}
		return carss;
	}

	/** O파라메터로 전달된 번호와 같은 차량 정보를 리턴한다 */
	public Car search(String num) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] == null)
				break;
			if (cars[i].getNum() == num)
				return cars[i];
		}
		return null;
	}

	/** O파라메터로 전달된 가격보다 작은 차량 정보들을 리턴한다 */
	public Car[] search(int price) {
		int cnt = 0;
		Car[] carsp = new Car[cars.length];
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] == null)
				break;
			if (cars[i].getPrice() < price) {
				carsp[cnt++] = cars[i];
			}
		}
		Car[] carssp = new Car[cnt];
		for (int i = 0; i < cnt; i++) {
			carssp[i] = carsp[i];
		}
		return carssp;
	}

	/** O파라메터로 전달된 번호의 차량을 검색하여 가격을 수정한다. */
	public void update(String num, int price) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null && cars[i].getNum() == num) {
				cars[i].setPrice(price);
			}
		}
	}

	/** O파라메터로 전달된 번호의 차량을 삭제한다. */
	public void delete(String num) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null && cars[i].getNum() == num) {
				for (int j = i + 1; j < cars.length; j++) {
					cars[j - 1] = cars[j];
				}
				cars[99] = new Car();
				index--;
			}
		}
	}

	/** O배열에 저장된 차량 대수를 리턴한다. */
	public int size() {

		return index;
	}

	/** O배열에 저장된 차량의 금액 합계를 계산하여 리턴한다 */
	public int totalPrice() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += cars[i].getPrice();
		}
		return total;
	}
}
