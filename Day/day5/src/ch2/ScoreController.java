package ch2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 사용자 입,출력 제어
public class ScoreController {
	private ScoreService service;
	private Scanner sc = new Scanner(System.in);

	public ScoreController(ScoreService service) {
		this.service = service;
	}

	public void run() {
		while (true) {
			System.out.println("번호 입력: 1-점수입력, 2-전체조회, 3-학생수, 4-분석, 0-종료");
			int q = sc.nextInt();
			sc.nextLine();

			switch (q) {
			case 0:
				return;
			case 1:
				System.out.println("이름: ");
				String name = sc.nextLine();

				System.out.println("국어: ");
				int kor = sc.nextInt();
				sc.nextLine();

				System.out.println("영어: ");
				int eng = sc.nextInt();
				sc.nextLine();

				System.out.println("수학: ");
				int math = sc.nextInt();
				sc.nextLine();

				service.addScore(name, kor, eng, math);
				System.out.println("입력 완료");
				break;
			case 2:
				showData();
				break;
			case 3:
				int studentCnt = service.getAllScore().size();
				System.out.println("총 학생 수는 " + studentCnt + "명 입니다.");
				break;
			case 4:
				// 최고 총점
				List<ScoreDTO> scoreList = service.getAllScore();

				if (scoreList.isEmpty()) {
					System.out.println("데이터가 없습니다.");
					continue;
				} else {
					int max = service.getMaxTotal();
					System.out.println("최고 총점: " + max);
					int min = service.getMinTotal();
					System.out.println("최저 총점: " + max);
				}
				
				//총점 평균
				double avg = service.getAvgTotal();
				//System.out.println("총점 평균: " + String.format("%.2f", avg));
				System.out.printf("총점 평균: %.2f\n",avg);
				break;
			default:
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	public void showData() {
		List<ScoreDTO> scoreList = service.getAllScore();

		if (scoreList.isEmpty()) {
			System.out.println("저장된 데이터가 없습니다.");
		} else {
			for (ScoreDTO dto : scoreList) { // score에서 순차적으로 꺼내 dto에 담아 출력
				System.out.println(dto);
			}
			/*
			 * for(int i=0;i<score.size();i++){ ScoreDTO dto = scores.get(i);
			 * System.out.println(dto); }
			 */
		}
	}

}
