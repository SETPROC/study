package day3;

import java.util.Random;

public class Test5 {
	public static void randFood() {
		Random r = new Random();
		String[] food = { "라면", "김밥", "파스타", "샐러드" };
		System.out.println("오늘 추천 메뉴는 " + food[r.nextInt(food.length)]);
	}

	public static void main(String[] args) {
		randFood();
	}
}
