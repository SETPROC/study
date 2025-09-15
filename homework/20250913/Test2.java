package day3;

import java.util.Scanner;

public class Test2{

	public static int total() {
		Scanner sc = new Scanner(System.in);
		System.out.print("마신 커피 수를 입력하세요: ");
		int n = sc.nextInt();
		return n * 80;
	}

	public static void main(String[] args) {
		System.out.println("총 카페인량: " + total() + "mg");
	}
}
