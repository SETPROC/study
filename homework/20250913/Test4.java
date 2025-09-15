package day3;

import java.util.Random;

public class Test4 {
	public static void lovePer(String a, String b) {
		Random r = new Random();
		System.out.println(a + "님과 " + b + "님의 연애 성공 확률은 " + r.nextInt(0, 101) + "%");
	}

	public static void main(String[] args) {
		lovePer("배민혁","가나다");
	}
}
