package homework;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드를 입력해주세요. : ");
		String password = sc.nextLine();
		String PW = "qwer1234";
		
		if(PW.equals(password))
			System.out.println("비밀번호가 맞아요!");
		else
			System.out.println("비밀번호가 틀렸어요!");
		
	}

}
