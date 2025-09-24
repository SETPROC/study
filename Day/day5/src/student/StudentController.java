package student;

import java.util.List;
import java.util.Scanner;

public class StudentController {
	Scanner sc = new Scanner(System.in);

	private StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}

	public void run() {
		while (true) {
			System.out.print(" 1-등록\n 2-출력\n 0-프로그램 종료\n 번호 입력:");
			int q = sc.nextInt(); // 90\n
			sc.nextLine(); // 숫자 입력 후 남아 있는 엔터값(개행문자 \n)을 바로 읽어서 버림. 버퍼 정리

			switch (q) {
			case 1:
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("학번: ");
				int number = sc.nextInt();
				sc.nextLine(); // 숫자 입력 후 남아 있는 엔터값(개행문자 \n)을 바로 읽어서 버림. 버퍼 정리
				System.out.print("과목: ");
				String subject = sc.nextLine();
				System.out.print("나이: ");
				int age = sc.nextInt();
				sc.nextLine(); // 숫자 입력 후 남아 있는 엔터값(개행문자 \n)을 바로 읽어서 버림. 버퍼 정리

				service.addStudent(name, number, subject, age);
				System.out.println("등록");
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
		List<StudentDTO> student = service.getAllStudent();

		for (StudentDTO dto : student) // member 리스트에서 순차적으로 꺼내 dto에 담아 출력
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
