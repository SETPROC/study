package ch2;

public class Parents {
	//필드
	int field1;
	String field2;
	
	public Parents() {}
	
	public Parents(int field1, String field2) {
		this.field1 = field1;
		this.field2 = field2;
	}
	
	public void method1() {
		System.out.println("부모 메서드1");
	}
	public void method2() {
		System.out.println("부모 메서드2");
	}
	//생성자
	//public Parents(){}
	
	
}
