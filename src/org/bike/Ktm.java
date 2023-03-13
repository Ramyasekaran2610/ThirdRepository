package org.bike;

public class Ktm implements Bike{

	public void cost() {
		System.out.println("cost= 1,00,000");
	}

	public void speed() {
		System.out.println("speed= 60Km");
	}
	public static void main(String[] args) {
		Ktm o = new Ktm();
		o.cost();
		o.speed();
	}

}
