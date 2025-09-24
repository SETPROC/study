package homework;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 마신 커피 수를 입력하세요:");
		int count = sc.nextInt();
		if(count==0)
			System.out.println("여긴 어디? 😵");
		else if(count == 1)
			System.out.println("완전 맑은 정신~ 🍀");
		else if(count >= 3)
			System.out.println("기분 좋은 상태! 😄");
	}

}
