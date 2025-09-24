package day5;

import java.util.List;
import java.util.Scanner;

// 사용자 입/출력 제어
public class MemberController {

	Scanner sc = new Scanner(System.in);

	private MemberService service;

	public MemberController(MemberService service) {
		this.service = service;
	}

	public void run() {
		while (true) {
			System.out.println("번호입력:1-회원입력, 2-회원출력, 0-프로그램 종료");
			int q = sc.nextInt(); // 90\n
			sc.nextLine(); // 숫자 입력 후 남아 있는 엔터값(개행문자 \n)을 바로 읽어서 버림. 버퍼 정리

			switch (q) {
			case 1:
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("아이디: ");
				String id = sc.nextLine();
				System.out.print("이메일: ");
				String email = sc.nextLine();

				service.addMember(name, id, email);
				System.out.println("회원 등록");
				break;
			case 2:
				showMember();
				
				break;
			case 0:
				System.out.println("프로그램 종료");
				return; // 즉시 종료
			default:
			}
		}
	}
	void showMember() {
		List<MemberDTO> member = service.getAllMember();
		
		for(MemberDTO dto : member) //member 리스트에서 순차적으로 꺼내 dto에 담아 출력
		{
			System.out.println(dto);
		}
		
//		for (int i = 0; i < member.size(); i++) {
//			MemberDTO dto = member.get(i);
//			System.out.println(dto);
//		}
		
//		for(타입 변수명: 컬렉션/배열) {
//			실행문
//		}
		
	}
}
