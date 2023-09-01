package org.bike;

public class ktm implements Bike {

	@Override
	public void cost() {
	System.out.println("85000");
	}

	@Override
	public void speed() {
	System.out.println("80km/hr");	
	}
	
	public static void main(String[] args) {
		ktm k = new ktm();
		 k.cost();
		 k.speed();

}
	
}

