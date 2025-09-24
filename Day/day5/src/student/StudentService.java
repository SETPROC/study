package student;

import java.util.List;

public class StudentService {
	
	private StudentDAO dao;

	public StudentService(StudentDAO dao) {
		this.dao = dao;
	}
	
	//DAO(저장소)에 저장된 전체 회원 반환
	public List<StudentDTO> getAllStudent() {
		return dao.findAll();
	}
	
	// 리스트 추가를 위한 구체적인 회원 등록
	public void addStudent(String name,int number, String subject,int age) {
		StudentDTO dto = new StudentDTO(name, number, subject, age);
		dao.save(dto);
	}
}
