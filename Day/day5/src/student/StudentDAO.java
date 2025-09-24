package student;

import java.util.ArrayList;
import java.util.List;
// 등록:
// 조회:
public class StudentDAO {
	private List<StudentDTO> studentList = new ArrayList<>();
	
	public void save(StudentDTO dto) {
		studentList.add(dto);
	}
	
	public List<StudentDTO> findAll() {
		return studentList;
	}
}
