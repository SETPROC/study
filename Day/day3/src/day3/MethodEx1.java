package day3;

public class MethodEx1 {
	public static void sayHello() {
		System.out.println("Hello");
	}

	public static void callName(String name) {
		System.out.println("안녕하세요, " + name + "님!!!");
	}

	public static int square(int x) {
		return x * x;
	}

	public static boolean isAdult(int age) {
		return age >= 19;
	}

	// 매개변수 name을 받아 "Hello, " + name으로 반환
	public static String callNameString(String name) {
		return "Hello, " + name;
	}

	public static void printSum(int a, int b) {
		System.out.println("" + a + " + " + b + " = " + (a + b));
	}

	public static int getSum(int a, int b) {
		return a + b;
	}

	// 메서드 오버로딩
	// 이름은 같고 매개변수만 다르게 하여 여러 메서드를 정의하는 것
	public static int multi(int a, int b) {
		return a + b;
	}

	public static double multi(double a, double b) {
		return a * b;
	}

	// 메소드 호출
	public static void main(String[] args) {
		// 결과를 돌려받지 않고 실행만 함
		sayHello();
		// 매개변수가 있는 메서드
		callName("한라봉");
		System.out.println("x * x = " + square(15));
		System.out.println("성인: " + isAdult(20));
		System.out.println(callNameString("배민혁"));
		String hello = callNameString("배민혁");

		System.out.println(hello);

		printSum(7, 8);
		int result = getSum(7, 8);
		System.out.println(result);
		System.out.println(multi(3, 2));
		System.out.println(multi(3.0, 2));
		
	}
}
