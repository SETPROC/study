package ch1;

public class DeliveryOrder {
	String food;
	String address;
	public DeliveryOrder(String food, String address) {
		this.food = food;
		this.address = address;
	}
	public void deliver() {
		System.out.println("음식: "+ this.food);
		System.out.println("주소: "+ this.address);
	}

}
