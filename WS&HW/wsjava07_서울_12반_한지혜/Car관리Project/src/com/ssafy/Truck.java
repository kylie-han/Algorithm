package com.ssafy;

public class Truck extends Car{
	private int ton;
	public Truck() {
		// TODO Auto-generated constructor stub
	}
	public Truck(String num, String model, int price,int ton) {
		super(num, model, price);
		this.ton = ton;
	}
	public int getTon() {
		return ton;
	}
	public void setTon(int ton) {
		this.ton = ton;
	}
	@Override
	public String toString() {
		return super.toString().replace("Car", "Truck").replace("]", ", ") + "ton=" + ton + "]";
	}
	
}
