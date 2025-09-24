package homework;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.: ");
		int age= sc.nextInt();
		if(age>=19)
			System.out.println("성인입니다.");
		else
			System.out.println("미성년입니다.");
		
	}

}
