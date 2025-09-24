package ch2;

/*
 * 연산자란?
 * 값을 계산할 때 사용하는 기호
 * 
 *
 */
public class Operation1 {

	public static void main(String[] args) {
		// 산술 연산자 + , - , * , / , %
		int a = 10 + 5; // 덧셈
		int b = a - 5; // 뺄셈
		int c = 7 * 3; // 곱셈
		int d = 8 / 2; // 나눗셈
		int e = 9 % 4; // 나머지값

		// 형변환이라는 게 필요함.
		double qwe = (double) 9 / 2;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("=======");

		// 비교 연산자: ==, != , > , <, >= , <=
		boolean isSame = (5 == 5); // 같다
		boolean isDiff = (10 != 5); // 같지 않다
		boolean isBig = (10 > 5); // 크다
		boolean isSmall = (1 < 5); // 작다
		boolean isGt = (7 >= 7); // 크거나 같다
		boolean isLt = (6 <= 4); // 작거나 같다

		System.out.println(isSame);
		System.out.println(isDiff);
		System.out.println(isGt);
		System.out.println(isLt);

		// 논리 연산자: && , ||(OR 둘 중 하나만 참), !(부정)
		boolean isOp1 = (5 > 2) && (5 < 20);
		boolean isOp2 = (5 > 2) || (5 < 20);
		boolean isOp3 = !(7 <= 5);

		// A조건 && B조건 둘 다 참
		// A조건 || B조건 둘 중 하나만 참
		// 값의 반대 false의 부정은 true

		System.out.println(isOp1);
		System.out.println(isOp2);
		System.out.println(isOp3);

		int apple = 12;
		int year = 2025;
		int money = -1000;
		double length = 9.8;
		double score = 88.5;
		double minusValue = -4.6;
		String food = "떡볶이";
		String city = "서울";
		String hobby = "코딩";
		boolean hasCar = false;
		boolean isStudent = true;
		boolean isWeekend = false;

		double result;
		result = a + b;
		System.out.println(result);
		result = a - b;
		System.out.println(result);
		result = a * b;
		System.out.println(result);
		result = a / b;
		System.out.println(result);
		result = a % b;
		System.out.println(result);

		int sum = 12 + 8;
		int total = 20 / 3;
		int mod = 14 % 5;
		System.out.println("5/5를 하면 몫이 1이고 나머지가 0인데 %연산자이므로 0이다.");
		System.out.println("5/4를 하면 몫이 1이고 나머지가 4인데 %연산자이므로 1이다.");
		System.out.println("5/3를 하면 몫이 1이고 나머지가 2인데 %연산자이므로 2이다.");
		System.out.println("5/2를 하면 몫이 2이고 나머지가 1인데 %연산자이므로 1이다.");
		System.out.println("5/1를 하면 몫이 5이고 나머지가 0인데 %연산자이므로 0이다.");
		System.out.println("5/7를 하면 몫이 0이고 나머지가 3인데 %연산자이므로 5이다.");
		System.out.println("5%0은 처음부터 0으로 무엇을 나눌 수 없기 때문에 예외처리로 종료된다.");
		// 15가 20보다 큰지 result1에 저장
		boolean result1 = 15 > 20;
		System.out.println(result1);
		// 10과 10이 같은지 result2에 저장
		boolean result2 = (10 == 10);
		System.out.println(result2);
		// 7이 3보다 작거나 같은지 result3에 저장
		boolean result3 = (7 < 3);
		System.out.println(result3);
		a = 5;
		b = 7;
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		// 10이 5보다 크고 2가 1보다 큰지 logic1에 저장
		boolean logic1 = (10 > 5) && (2 > 1);
		System.out.println(logic1);
		// 3이 7과 같거나, 6이 2보다 작은지 logic2에 저장
		boolean logic2 = (3 == 7) && (6 < 2);
		System.out.println(logic2);
		// 8이 8과 같지 않은지 logic3에 저장
		boolean logic3 = (8 != 8);
		System.out.println(logic3);
		// x = true, y = false 변수에 대입하여 논리 연산자 전부를 이용해 각 각 연산
		boolean x = true;
		boolean y = false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);

	}
}
