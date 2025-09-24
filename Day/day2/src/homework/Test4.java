package homework;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
/*
 * animal이 "강아지"면 "멍멍!",
 * "고양이"면 "야옹!",
 * 그 외엔 "무슨 동물이야?"를 출력
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 동물을 좋아해?: ");
		String animal = sc.nextLine();
		switch(animal) {
		case "강아지"->
			System.out.println("멍멍");
		case "고양이"->
			System.out.println("야옹!");
		default->
			System.out.println("무슨 동물이야?");
		}
	}

}
