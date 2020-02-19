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

	/** O�Ķ���ͷ� ���޵� ���� ������ �迭�� �����Ѵ� */
	public void add(Car c) {
		cars[index] = c;
		index++;
	}

	/** O���� ����� ��� ���� ������ �����Ѵ� */
	public Car[] search() {
		Car[] carss = new Car[index];
		for (int i = 0; i < index; i++) {
			carss[i] = cars[i];
		}
		return carss;
	}

	/** O�Ķ���ͷ� ���޵� ��ȣ�� ���� ���� ������ �����Ѵ� */
	public Car search(String num) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] == null)
				break;
			if (cars[i].getNum() == num)
				return cars[i];
		}
		return null;
	}

	/** O�Ķ���ͷ� ���޵� ���ݺ��� ���� ���� �������� �����Ѵ� */
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

	/** O�Ķ���ͷ� ���޵� ��ȣ�� ������ �˻��Ͽ� ������ �����Ѵ�. */
	public void update(String num, int price) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null && cars[i].getNum() == num) {
				cars[i].setPrice(price);
			}
		}
	}

	/** O�Ķ���ͷ� ���޵� ��ȣ�� ������ �����Ѵ�. */
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

	/** O�迭�� ����� ���� ����� �����Ѵ�. */
	public int size() {

		return index;
	}

	/** O�迭�� ����� ������ �ݾ� �հ踦 ����Ͽ� �����Ѵ� */
	public int totalPrice() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += cars[i].getPrice();
		}
		return total;
	}
}
