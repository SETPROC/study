package test;

public class PersonMain {

	public static void main(String[] args) {
		Person[] a = new Person [5];
		for (int i = 0; i <= 4; i++)
			a[i] = new Person();

		a[0].setAge(63);
		a[0].setName("김말숙");

		a[1].setAge(87);
		a[1].setName("김말자");

		a[2].setAge(74);
		a[2].setName("김영수");

		a[3].setAge(86);
		a[3].setName("김영자");

		a[4].setAge(76);
		a[4].setName("김순자");

		for (int i = 0; i <= 4; i++) {
			a[i].getAge();
			a[i].getName();
			System.out.println("=============");
		}
	}
}
