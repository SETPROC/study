package test;

public class Person {
	private String name;
	private int age;

	public void getName() {
		System.out.println("이름:" + name);;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getAge() {
		System.out.println("나이: " + age);
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
