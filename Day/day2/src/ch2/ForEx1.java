package ch2;

import java.util.Scanner;

/*
 * 반복문이란?
 * 정해진 횟수만큼 반복
 * for(초기값;조건식;증감값){
 *  실행문
 * }
 * 
 * 
 */
public class ForEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1~5까지
		// i++ 후위증가연산자. 1씩 증가 / i-- 1씩 감소

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + (i != 5 ? "," : ""));
		}

		System.out.println("======");

//		for (int i = 1; i <= 5; i++) {
//			System.out.print(++i + ",");
//			System.out.print(i++ + ",");
//			System.out.print(i);
//			System.out.println();
//		}

		// 10부터 1까지 거꾸로 출력
		for (int i = 10; i >= 1; i--)
			System.out.print(i + (i == 1 ? "" : ","));

		// 1~10까지 중 홀수만 출력
		for (int i = 1; i <= 10; i += 2)
			System.out.println(i);

		int n = 0;
		int sum = 0;
		
		System.out.println("숫자를 입력해주세요.");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}

		int [] nums= {3,5,7,9};
		for(int i=0;i<nums.length;i++)
			System.out.println(nums[i]);
		
	}

}
