package ch2;

public class Main {

	public static void main(String[] args) {
		
		//선언
		Parents p1;
		// p1.method1(); 선언만 하고 객체(인스턴스) 생성은 하지 않았기 때문에
		// 오류 발생
		
		System.out.println("=== Parents ===");
		p1 = new Parents();
		p1.method1();
		p1.method2();
		
		System.out.println("=== Children ===");
		p1 = new Children();
		p1.method1();
		p1.method2();
		//p1.method3();
		
		Children c1 = new Children();
		c1.method3();
		
		System.out.println("=== Child ===");
		p1 = new Child();
		p1.method1();
		p1.method2();
		
		// 부모 클래스로부터 유도된 인스턴스로 선언하면 모든 캐스팅이 가능함.
		
	}

}
