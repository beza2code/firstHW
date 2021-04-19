package week2;

import acm.program.GraphicsProgram;
import acm.graphics.*;
import java.awt.*;


public class RobotFace extends GraphicsProgram {

	/* Parameters for the robot face */
	private static final int head_width = 150;
	private static final int head_height = 200;
	private static final int eye_radius = 20;
	private static final int mouth_width = 70;
	private static final int mouth_height = 15;
 
    public void run() {
        head();
        leftEye();
        rightEye();
        mouth();
    }
    /* creating the robot head */
    private void head() {
        double startingWidth = ((getWidth()/2) - (head_width/2));
        double startingHeight = ((getHeight()/2) - (head_height/2));
        GRect face = new GRect (startingWidth, startingHeight, head_width, head_height);
        add(face);
        face.setFilled(true);
        face.setFillColor(Color.GRAY);
    }
    /* creating the robot left eye */

    private void leftEye() {
        double startingWidth = getWidth()/2 - head_width/4 - eye_radius/2;
        double startingHeight = getHeight()/2 - head_height/4 - eye_radius/2;
        GOval leftEye = new GOval (startingWidth, startingHeight, eye_radius, eye_radius);
        add(leftEye);
        leftEye.setFilled(true);
        leftEye.setFillColor(Color.YELLOW);
    }
    /* creating the robot right eye */

    private void rightEye() {
        double startingWidth = getWidth()/2 + head_width/4 - eye_radius/2;
        double startingHeight = getHeight()/2 - head_height/4 - eye_radius/2;
        GOval rightEye = new GOval (startingWidth, startingHeight, eye_radius, eye_radius);
        add(rightEye);
        rightEye.setFilled(true);
        rightEye.setFillColor(Color.YELLOW);
    }
    /* creating the robot mouth */

    private void mouth() {
        double startingWidth = getWidth()/2 - mouth_width/2;
        double startingHeight = getHeight()/2 + head_height/4 - mouth_height/2;
        GRect mouth = new GRect (startingWidth, startingHeight, mouth_width, mouth_height);
        add(mouth);
        mouth.setFilled(true);
        mouth.setFillColor(Color.WHITE);

}
}
