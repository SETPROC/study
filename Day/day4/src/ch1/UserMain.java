package ch1;

public class UserMain {

	public static void main(String[] args) {
	/*
	 * 클래스에 기본 생성자, set메서드를 만들지 않았기 때문에 오류
	 * User user = new User();
	 * user.setId("abc");
	 * 
	 * 회원정보 작성에서 정보가 빠진 채로 객체가 생기는 걸 방지하기 위해
	 * 매개변수가 있는 생성자 사용
	 */
		User user = new User("abc","1234");
		System.out.println(user.getId());
		System.out.println(user.getPassword());
		
	}

}
