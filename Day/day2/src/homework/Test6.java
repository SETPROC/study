package homework;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요일을 입력하세요 일월화수목금토(0~6): ");
		int day = sc.nextInt();
		if(day==0 || day==6)
		{
			System.out.println("주말이야!");
		}
		else
			System.out.println("평일이야");
	}
}
