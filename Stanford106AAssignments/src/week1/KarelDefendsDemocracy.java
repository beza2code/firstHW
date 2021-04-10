package week1;
import stanford.karel.*;
// karel to clean up the ballot
public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			move();
			checkMiddleBox();
			checkBeepers();
			move();	
		}			
	}
	
private void checkMiddleBox() {
	if (beepersPresent()) {
		move();
		move();
	}
}
private void checkBeepers() {
	if (noBeepersPresent()) {
		checkSouth();
		checkNorth();
		
	}
}

// karel checks south for beeper
// karel will pick up beeper if present

private void checkSouth() {
		turnRight();
		move();
	while (beepersPresent()) {
		pickBeeper();
	}
		turnAround();
		move();
		
}

// karel checks north for beeper
// karel will pick up beeper if present
// karel finishes cleaning up

private void checkNorth() {
		move();
	if (frontIsClear()) {
		move();
	}
	while (beepersPresent()) {
		pickBeeper();
		
	}
		turnAround();
		move();
		turnLeft();
	}
}
