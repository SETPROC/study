package ch1;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// ㄴ클래스ㄴsc는 인스턴스라고 함.
		// 클래스: 설계도, 붕어빵 틀

		// 객체, 인스턴스: 클래스로부터 실제 사용할 수 있게
		// 만들어져 메모리에 존재하는 것
		// 다만 사용할 수 있게 만들어지기만 한 것은 객체,
		// 사용되어져서 추상적으로 존재하는 것을 인스턴스라고 한다.
		
		Scanner sc = new Scanner(System.in);
		// 클래스로부터 실제로 사용할 수 있게 객체로 만듦.
		
		// .nextInt(); 정수 입력받기
		// .nextDouble(); 실수 입력받기
		// .nextLine(); 문자열 입력받기
		
		System.out.println("점수를 입력하세요: ");
		int score = sc.nextInt();
		System.out.println("입력한 점수는: " + score + "점 입니다.");
	
	}

}
