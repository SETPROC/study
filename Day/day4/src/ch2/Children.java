package ch2;

public class Children extends Parents{
	//필드
	double field3;
	
	public Children() {	}
	//생성자
	public Children(int field1,String field2,int field3) {
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	
	//메서드
	@Override
	public void method2() {
		System.out.println("자식 메서드2");
	}
	public void method3() {
		System.out.println("자식 메서드3");
	}
	
}
