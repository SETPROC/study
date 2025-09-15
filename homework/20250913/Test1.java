package day3;

import java.util.Scanner;

public class Test1{

	public static int total() {
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 마리 수를 입력하세요: ");
		int n = sc.nextInt();
		return n * 8;
	}

	public static void main(String[] args) {
		System.out.println("전체 조각 수는 " + total());
	}
}
