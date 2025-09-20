package student;
/*
 * 학생 관리 프로그램
 * 이름, 학번, 학과, 나이
 * 

 * 프로그램 종료
 */
public class StudentDTO {
	
	private String name;
	private int number;
	private String subject;
	private int age;
	
	public StudentDTO() {}
	
	public StudentDTO(String name, int number, String subject, int age) {
		this.name = name;
		this.number = number;
		this.subject = subject;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "학생 이름 = " + name + ", 학번 = " + number + ", 학과 = " + subject + ", 나이 = " + age + "살";
	}
	
	
	
}
