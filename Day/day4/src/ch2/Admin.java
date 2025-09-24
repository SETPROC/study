package ch2;

public class Admin extends User{
	
	public Admin(String name,String email) {
		super(name,email);
	}
	
	public void manager() {
		System.out.println("관리자님 입장");
//		System.out.println(name);
	}
}
