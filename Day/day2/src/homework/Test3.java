package homework;

public class Test3 {

	public static void main(String[] args) {
/*
 * animal이 "강아지"면 "멍멍!",
 * "고양이"면 "야옹!",
 * 그 외엔 "무슨 동물이야?"를 출력
 */
		
		String animal = "고양이";
		switch(animal) {
		case "강아지":
			System.out.println("멍멍!");
			break;
		case "고양이":
			System.out.println("야옹!");
			break;
		default:
			System.out.println("무슨 동물이야?");
		}
	}

}
