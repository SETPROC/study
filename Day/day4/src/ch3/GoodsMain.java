package ch3;

public class GoodsMain {
	public static void main(String[] args) {
		// Goods gds = new Goods();
		// 추상 클래스는 객체 생성 불가
		Goods phone = new Phone("아이폰");
		phone.showBrand();
		phone.turnOn();
		phone.turnOff();
		
		System.out.println("======");
		Goods tv = new Tv("LG");
		tv.showBrand();
		tv.turnOn();
		tv.turnOff();
		
		// 추상 클래스 = 공통 필드 + 공통 메서드 + 추상메서드
		// 다형성: Goods 타입으로 다양한 제품 사용 가능
	}
}
