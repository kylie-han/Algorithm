package com.ssafy;

import java.util.Arrays;

public class CarTest {
	public static void main(String[] args) {
		CarMgr mgr = CarMgr.getInstance();
		Car c1 = new Car("1", "세단", 30);
		Car c2 = new Car("2", "세단", 30);
		Car b1 = new Bus("3", "현대", 500, 45);
		Car t1 = new Truck("4", "현대", 500, 100);
		mgr.add(c1);
		mgr.add(c2);
		mgr.add(b1);
		mgr.add(t1);
		mgr.delete("1");
		mgr.update("1", 50);
		System.out.println(Arrays.toString(mgr.search()));
		System.out.println(Arrays.toString(mgr.search(50)));
		System.out.println(mgr.search("1"));
		System.out.println(mgr.size());
		System.out.println(mgr.totalPrice());
	}
}
