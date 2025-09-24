package ch1;

public class Dog {
	// 속성(field): 강아지의 특성
	// 생성자(Constructor): 객체를 만들 때의 정보
	// 메서드(Method): 강아지의 동작
	
	String name;
	int age;
	String color;
	String type;
	double weight;
	boolean vaccine;
	
	public Dog(String name, int age, String color, String type, double weight, boolean vaccine) {
		//this 객체 자신을 나타내는 키워드
		//객체 자신의 필드를 참조하거나 해당 클래스의 다른 생성자를 호출할 때 사용
		//static(정적) 메서드에서는 this 사용할 수 없음
		this.name = name;
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.vaccine = vaccine;
	}
	
	void eat() {
		System.out.println("잘 먹고 있어요.");
	}
	
	void play() {
	System.out.println("잘 놀고 있어요.");	
	}
	
	void pupu() {
		System.out.println("배변 산책은 중요합니다.");
	}
	
	
	
}
