package ch1;

import java.util.Scanner;

public class Control2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = 28;
		if (temp >= 20)
			System.out.println("덥다");
		else if (temp >= 30)
			System.out.println("쾌적함");
		else
			System.out.println("안 덥다");
		System.out.println("======");
		// 90점 이상이면 A, 80점 이상면 B, 70점 이상이면 C,
		// 나머지는 D
		
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		char grade;
		
		if (90 < score && score <= 100)
			grade = 'A'; // 재할당
		else if (score > 80)
			grade = 'B';
		else if (score > 70)
			grade = 'C';
		else // <- 그 외의 모든 것들을 의미해서 else if 안써도 돼
			grade = 'D';
		System.out.println("점수:" + score + ", " + "학점:" + grade);
		
	}
}
