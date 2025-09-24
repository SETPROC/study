package ch1;

import java.util.Scanner;

public class Control4 {

	public static void main(String[] args) {
		// 1~10까지의 정수 중 하나를 입력 받아 홀,짝수 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("1~10까지의 정수 중 하나를 입력:");
		int num = sc.nextInt();
		if (1 <= num && num <= 10)
		// System.out.println(num%2==0 ? "짝수입니다." : "홀수입니다.");
		{
			if (num % 2 == 0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
		} else
			System.out.println("다시 입력하세요(1~10)");
	}

}
