package ch1;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class YumController {
	private Scanner sc = new Scanner(System.in);
//	private YumService service;
//	public YumController(YumService service) {
//		this.service = service;
//	}

	private YumService service = new YumService();
	
	public void run() {
		while(true)
		{
			System.out.println("\n1.맛집등록 | 2.전체 조회 | 3.개별 조회 | 4.수정 | 5.삭제 | 0.종료");
			int n = sc.nextInt();
			sc.nextLine();
			switch(n)
			{
			case 1:
				addYum();
				break;
			case 2:
				viewAllYum();
				break;
			case 3:
				viewYum();
				break;
			case 4:
				updateYum();
				break;
			case 5:
				deleteYum();
				break;
			case 0:
				System.out.println("프로그램 종료");
				sc.close(); //자원 종료
				return;
			default:
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	//등록
	private void addYum() {
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.print("메뉴를 입력하세요: ");
		String menu = sc.nextLine();
		
		System.out.print("점수를 입력하세요(1~5): ");
		int rating = sc.nextInt();
		sc.nextLine();
		
		System.out.print("방문 날짜를 입력하세요 (yyyy-mm-dd): ");
		Date visitDate = Date.valueOf(sc.nextLine());
		
		service.addYum(name,menu,rating,visitDate);
	}
	
	//전체 조회
	private void viewAllYum() {
		List<YumDTO> list = service.getAllYum();
		outYumList(list);	
	}
	
	private void outYumList(List<YumDTO> list) {
		//null 객체 자체가 없는 경우
		//.isEmpty(); 객체는 있는데 데이터가 없음.
		if(list == null | list.isEmpty()) {
			System.out.println("등록된 자료가 없습니다.");
		}
		else {
			for(YumDTO dto: list)
			{
				System.out.println(dto);
			}	
		}
	}
	
	//	개별 조회
	private void viewYum() {
		List<YumDTO> list = service.getAllYum();
		String sqlValue = "";
		YumDTO dto;
		if(list == null || list.isEmpty())
		{
			System.out.println("등록된 자료가 없어서 되돌아갑니다.");
			return;
		}
		
		System.out.println("1. 아이디로 조회하기");
		System.out.println("2. 이름으로 조회하기");
		System.out.println("0. 돌아가기");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num)
		{
		case 1:
			System.out.print("아이디를 입력해주세요 : ");
			sqlValue = sc.nextLine();
			dto = service.getYum(1, sqlValue);
			if(dto==null) return;
			System.out.println(dto);
			break;
		case 2:
			System.out.print("이름을 입력해주세요 : ");
			sqlValue = sc.nextLine();
			dto = service.getYum(2, sqlValue);
			if(dto==null) return;
			System.out.println(dto);
			break;
		case 0:
			System.out.println("처음 화면으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다. 처음 화면으로 돌아갑니다.");
			return;
		}
		
		
	}

	//수정
	private void updateYum() {
		List<YumDTO> list = service.getAllYum();
		int id,result,rating;
		String name,menu;
		Date visitDate;
		
		if(list == null || list.isEmpty())
		{
			System.out.println("등록된 자료가 없어서 되돌아갑니다.");
			return;
		}
		
		System.out.print("수정할 아이디를 입력해주세요 : ");
		id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("변경할 이름으로 작성해주세요 : ");
		name = sc.nextLine();
		
		System.out.print("변경할 메뉴로 작성해주세요 : ");
		menu = sc.nextLine();
		
		System.out.print("점수를 변경해주세요 (1~5): ");
		rating = sc.nextInt();
		sc.nextLine();
		
		System.out.println("방문일을 입력해주세요 (yyyy-mm-dd): ");
		visitDate = Date.valueOf(sc.nextLine());
		
		result = service.updateYum(id,name,menu,rating,visitDate);
		
	}

	//삭제
	private void deleteYum() {
		List<YumDTO> list = service.getAllYum();
		int id,result;
		
		if(list == null || list.isEmpty())
		{
			System.out.println("등록된 자료가 없어서 되돌아갑니다.");
			return;
		}
		
		System.out.print("삭제할 아이디를 입력해주세요 : ");
		id = sc.nextInt();
		sc.nextLine();
		result = service.deleteYum(id);
		
	}

	
}
