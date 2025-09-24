package ch1;

/*
 * switch문
 * switch (비교값) {
		case value:
			실행문
			break;
		default:
			그 외의 경우
		}
 */
import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result="";
		System.out.println("요일을 숫자로 (월~일)1~7까지 적어주세요.");
		int day = sc.nextInt();
		if(day >=0 && day <=7) {
			switch (day) {
			case 0:
				result = "일요일";
				break;
			case 1: 
				result = "월요일";
				break;
			case 2:
				result = "화요일";
				break;
			case 3:
				result = "수요일";
				break;
			case 4:
				result = "목요일";
				break;
			case 5:
				result = "금요일";
				break;
			case 6:
				result = "토요일";
				break;
			}
			System.out.println("오늘은 "+ result + "입니다.");
		}
		else {
			System.out.println("정해진 숫자만 입력하세요.");
			}
	}
}

