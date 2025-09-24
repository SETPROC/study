package ch1;

/*
 * 클래스
 * 설계도, 객체를 만들기 위한
 * 상태(속성)와 행위(메서드)를 가짐.
 * 
 * 속성(Attribute)
 * 객체가 가지는 변수의 속성
 * 특정 값을 가질 수 있으며 객체의 속성 값은 객체의 상태를 표현
 * 넓은 의미로는 필드Field 포함. 객체가 가지고 있는 특성 모두를 의미
 * 메서드(Method)
 * 데이터를 조작하는 행위. 동사로 표현
 * 메서드를 호출하여 객체의 상태를 변경하거나 내부 상태 값을 가져올 수 있음
 * 
 * class 클래스명 {
 *		필드1
 *		필드2
 *
 *		생성자1
 *		생성자2
 *		
 *		메서드1
 *
 *
 *
 */

public class TestData {
	int field1;
	double field2;
	short field3; // 짧은 정수형 2byte
	private float field4; // 짧은 실수.
	boolean field5;
	String field6;

	/*
	 * 생성자 객체를 만들 때(new 키워드 사용) 자동으로 호출되는 특별 메서드 주로 초기값을 설정할 때 사용 객체를 생성하자마자 동작(초기화,
	 * 메시지 출력 등) 할 수 있게 함.
	 * 
	 * 특징) 클래스 이름과 동일한 이름을 가짐 리턴 타입 없음. void 안 씀. 객체를 만들 때만 실행됨.
	 * 
	 * TestData(){} 기본 생성자. 생략 가능. 생략하면 자바가 알아서 있다고 가정함. TestData t = new
	 * TestData(); // 에러 없음.
	 * 
	 * 오버로딩: 같은 이름으로 매개변수의 갯수나 타입을 달리해 메서드나 함수를 정의하는 것
	 * 
	 * getter 클래스 안의 필드 값을 읽어오는 메서드 get 필드명
	 * 
	 * setter 클래스 안의 필그값을 바꿔주는 메서드 set필드명()
	 * 
	 * 캡슐화 원칙으로 인해 private 필드에 직접 접근하지 못하고 getter / setter를 통해서만 값을 읽거나 쓸 수 있음
	 * 
	 */
	TestData() {

	}

	TestData(int field1) {
		this.field1 = field1;
	}

	TestData(int field1, float field4) {
		this.field1 = field1;
		this.field2 = field4;
	}

	public void method1() {
		System.out.println("메서드1");
	}

	public int method2() {
		return this.field1;
	}

	public float getField4() {
		return field4;
	}

	public int getField1() {
		return field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public double getField2() {
		return field2;
	}

	public void setField2(double field2) {
		this.field2 = field2;
	}

	public short getField3() {
		return field3;
	}

	public void setField3(short field3) {
		this.field3 = field3;
	}

	public boolean isField5() {
		return field5;
	}

	public void setField5(boolean field5) {
		this.field5 = field5;
	}

	public String getField6() {
		return field6;
	}

	public void setField6(String field6) {
		this.field6 = field6;
	}

	public void setField4(float field4) {
		this.field4 = field4;
	}

}
