package ch2;

// 자식 클래스
public class Child extends Parents{
	//필드
	double field3;

	//생성자	
	public Child() {
		
	}
	
	public Child(int field1,String field2,double field3) {
		super(field1,field2);
		this.field3 = field3;
	}

	//method2
	@Override
	public void method2() {
		System.out.println("child  메서드2");
	}
}
