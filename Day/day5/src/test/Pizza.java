package test;

public class Pizza {
	private String type;
	private String size;
	private int price;
	
	public Pizza(String type, String size, int price) {
		this.type = type;
		this.size = size;
		this.price = price;
	}

	@Override
	public String toString() {
		return "피자 종류: " + type + "\n피자 사이즈: " + size + "\n피자 가격:" + price + "원";
	}
	
	
}
