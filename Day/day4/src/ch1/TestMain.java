package ch1;

public class TestMain {

	// .main() 실행 메서드.
	// 어떤 클래스도 선언될 수 있음.
	// 인스턴스 생성과 무관하기 때문에 static으로 선언

	public static void main(String[] args) {
		// 객체(인스턴스) 생성
		// 클래스명 객체명 = new 생성자함수();
		TestData ts1 = new TestData();
		System.out.println("ts1: " + ts1);
		System.out.println("ts1.field1: " + ts1.field1);

		ts1.field1 = 100;
		System.out.println("ts1.field1: " + ts1.field1);
		ts1.field1 = 200;
		System.out.println("ts1.field1: " + ts1.field1);

//		ts1.field4 = 3.24f; private 접근제한자는 외부에서 접근 불가
//		Data 클래스에서 getter/setter 만들어 접근해야 함.
//		System.out.println("ts1.field4", ts1.fleid4);
		
		System.out.println("======ts2=====");
		TestData ts2 = new TestData();
		ts2.setField4(1.11f); //field4 필드에 값 저장
		System.out.println("ts2.field4: "+ts2.getField4());//값 호출
		
		TestData ts3 = new TestData();
		ts3.setField6("신나고 재미있는 자바의 세계"); //field6 필드에 값 저장
		System.out.println(ts3.getField6()); //값 호출
	
	}

}
