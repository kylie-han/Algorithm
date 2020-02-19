package com.ssafy;

public class Bus extends Car{
	private int seat;
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	public Bus(String num, String model, int price, int seat) {
		super(num, model, price);
		this.seat = seat;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	@Override
	public String toString() {
		return super.toString().replace("Car", "Bus").replace("]", ", ")+"seat=" + seat + "]";
	}
}
