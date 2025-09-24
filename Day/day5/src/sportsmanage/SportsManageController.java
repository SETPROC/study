package sportsmanage;

import java.util.List;
import java.util.Scanner;

public class SportsManageController {
	private Scanner sc = new Scanner(System.in);
	
	private SportsManageService service;
	
	public SportsManageController(SportsManageService service) {
		this.service = service;
	}

	public void run() {
		while (true) {
			System.out.println("체육센터 건강 관리 프로그램입니다.");
			System.out.println("등록 - 1");
			System.out.println("조회 - 2");
			System.out.println("종료 - 0");
			System.out.print("메뉴를 선택하세요: ");
			int n = sc.nextInt();
			sc.nextLine();
			switch (n) {
			case 1:
				System.out.print("회원 이름을 입력하세요: ");
				String name = sc.nextLine();

				System.out.print("회원 번호를 입력하세요: ");
				int num = sc.nextInt();
				sc.nextLine();

				System.out.print("기초 칼로리를 입력하세요: ");
				int bb = sc.nextInt();
				sc.nextLine();

				System.out.print("소비 칼로리를 입력하세요: ");
				int cc = sc.nextInt();
				sc.nextLine();
				
				service.save(name, num, bb, cc);;
				System.out.println("등록이 완료되었습니다.");
				break;
			case 2:
				showData();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	public void showData() {
		List<SportsManageDTO> sports = service.find();
		for (SportsManageDTO dto : sports) {
			System.out.println(dto);
		}
	}
}
