package test;

public class Main2 {
	public static void main(String[] args) {
		Person[] a = new Person[5];
		for(int i=0;i<=4;i++) {
			a[i] = new Person();	
			a[i].setName("사람"+i);
			a[i].setAge((int)(Math.random()*20)+1);
			a[i].setAddress("경기도");
		}
		for(int i=0;i<=4;i++)
		{
			System.out.println("이름: "+ a[i].getName());
			System.out.println("나이: "+ a[i].getAge() + " 세");
			System.out.println("주소: "+ a[i].getAddress());
			System.out.println("====================");
		}
		
	}
}
