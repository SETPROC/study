package ch2;

import java.util.Random;

public class RandEx1 {
	public static void main(String[] args) {
		Random random = new Random();
		int result = random.nextInt(2); // 0 혹은 1 중 하나 랜덤
		if(result == 0)
			System.out.println("동전의 앞면");
		else
			System.out.println("동전의 뒷면");
	}
}
