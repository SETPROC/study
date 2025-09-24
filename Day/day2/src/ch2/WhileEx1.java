package ch2;

import java.util.Scanner;

/*
 * 반복문
 * 초기값
 * while(조건){
 *  실행문
 *  증감값
 * }
 * 
 */
public class WhileEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		

		//1~5까지 출력
		int n = 1;
		while(n<=5)
		{
			System.out.println(n);
			n++; // 반드시 증감의 값이 있어야 함
		}
		System.out.println("======");
		//오하 3번 출력
//		n=1;
//		while(n<=3)
//		{
//			System.out.println("おは");
//			n++;
//		}
//		n=1;
//		while(n<=count)
//		{
//			System.out.println("おは");
//			n++;
//		}
		//2부터 10까지 짝수 출력
		
		int j=2;
		while(j<=10)
		{
			System.out.println(j);
			j+=2;
		}
		
		//1부터 5까지의 합
		int sum = 0;
		n = 1;
		while(n<=5)
		{
			sum+=n;
			n++;
		}
		System.out.println("sum의 값:"+sum);
		
	}

}
