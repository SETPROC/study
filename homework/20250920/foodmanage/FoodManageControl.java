package foodmanage;

import java.util.List;
import java.util.Scanner;

public class FoodManageControl {
	private Scanner sc = new Scanner(System.in);

	private FoodManageService service;

	public FoodManageControl(FoodManageService service) {
		this.service = service;
	}

	public void run() {
		while (true) {
			System.out.println("식자재 관리 프로그램입니다.");
			System.out.println("등록 - 1");
			System.out.println("조회 - 2");
			System.out.println("종료 - 0");
			System.out.print("메뉴를 선택하세요: ");
			int n = sc.nextInt();
			sc.nextLine();
			switch (n) {
			case 1:
				System.out.print("식자재 번호를 입력하세요: ");
				int num = sc.nextInt();
				sc.nextLine();

				System.out.print("식자재명을 입력하세요: ");
				String name = sc.nextLine();

				System.out.print("수량을 입력하세요: ");
				int cnt = sc.nextInt();
				sc.nextLine();

				System.out.print("등록 날짜를 입력하세요: ");
				String date = sc.nextLine();

				service.addFood(num, name, cnt, date);
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
		List<FoodManageDTO> foods = service.findAll();
		for (FoodManageDTO dto : foods) {
			System.out.println(dto);
		}
	}
}
