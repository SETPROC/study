package day3;

import java.util.Scanner;

public class Test3{

	public static int total() {
		Scanner sc = new Scanner(System.in);
		System.out.print("먹은 삼각 김밥 수를 입력하세요: ");
		int n = sc.nextInt();
		return n * 200;
	}

	public static void main(String[] args) {
		System.out.println("총 칼로리: " + total() + "kcal");
	}
}
