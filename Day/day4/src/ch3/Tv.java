package ch3;

public class Tv extends Goods{

	public Tv(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void turnOn() {
		System.out.println("텔레비전을 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("텔레비전을 끕니다.");		
	}
}
