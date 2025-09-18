package test;

public class Test1Main {
	public static void main(String[] args) {
		Test1 box = new Test1();
		box.setPassword("abc123");
		System.out.println("내 비밀번호는 "+box.getPassword());
	}
}
