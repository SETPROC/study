package ch2;

public class Food extends Product{
	private String maker;

	public Food(String name,int price) {
		super(name,price);
	}
	public void showFood() {
		showInfo();
	}
}
