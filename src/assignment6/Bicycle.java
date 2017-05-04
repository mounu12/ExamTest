package assignment6;

public class Bicycle implements IBicycle{
	private boolean isMoving;
	private int currentSpeed;

	public Bicycle() {
		isMoving = false;
		currentSpeed = 0;
	}

	public Bicycle(int speed) {
		if (speed > 0) {
			isMoving = true;
			currentSpeed = speed;
		} else {
			isMoving = false;
			currentSpeed = 0;
		}

	}

	public void increaseSpeed() {
		if (isMoving) {
			currentSpeed++;
		} else {
			isMoving = true;
			currentSpeed++;
		}
	}

	public void decreaseSpeed() {
		if (isMoving) {
			currentSpeed--;
		}
		if (currentSpeed == 0) {
			isMoving = false;
		}
	}

	public boolean ismoving() {

		return isMoving;

	}

	@Override
	public boolean isMoving() {
		// TODO Auto-generated method stub
		return false;
	}
}
