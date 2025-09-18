package test;

public class Car implements Vehicle {
	private int speed = 0;

	public void move() {
		System.out.println(getSpeed() + "속도로 이동합니다.");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
