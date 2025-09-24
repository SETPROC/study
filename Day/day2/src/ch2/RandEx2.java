package ch2;

import java.util.Random;

public class RandEx2 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int n = random.nextInt(6) + 1;
		System.out.println("주사위 랜덤 숫자: " + n);
		
		String[] fruits = {"사과","무화과","포도","복숭아"};
		int idx = random.nextInt(fruits.length);
		System.out.println("오늘의 과일: "+ fruits[idx]);
		

	}
}
