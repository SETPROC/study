package ch2;

import java.util.Scanner;

public class Deposit {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		int money = 0;
		int key = 0;

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택> ");
			key = scanner.nextInt();

			switch (key) {
			case 1:
				System.out.println("입금액을 입력하세요.");
				money = scanner.nextInt();
				if (money > 0) {
					System.out.println(money + "원 입금 되었습니다.");
				} else {
					System.out.println(money + "원 입금되지 않았습니다.");
				}
				balance += money;
				try {
					// 2초(2000밀리초) 대기
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("출금액을 입력하세요.");
				money = scanner.nextInt();
				if (money > 0 && balance - money >= 0) {
					System.out.println(money + "원 출금 되었습니다.");
				} else {
					System.out.println(money + "원 출금되지 않았습니다.");
				}
				balance -= money;
				try {
					// 2초(2000밀리초) 대기
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("잔고 : " + balance);
				try {
					// 2초(2000밀리초) 대기
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				try {
					// 2초(2000밀리초) 대기
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("프로그램 종료");
	}
}
