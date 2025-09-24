package ch1;

public class DogMain {
	public static void main(String[] args) {
		Dog dog1 = new Dog("흰둥이",3,"흰색","진돗개",6,true);
		Dog dog2 = new Dog("솜이",6,"흰색","사모예드",20,true);
		
		// 동작
		dog1.eat();
		dog2.pupu();	
		
	}
}
