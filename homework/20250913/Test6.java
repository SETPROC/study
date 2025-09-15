package day3;

import java.util.Random;

public class Test6 {
	public static String score(int n) {
		if (90 <= n && n <= 100)
			return "A";
		else if(n >= 80)
			return "B";
		else if(n >= 70)
			return "C";
		else if(n>=60)
			return "D";
		else
			return "F";
	}

	public static void main(String[] args) {
		System.out.println(score(60));
	}
}
