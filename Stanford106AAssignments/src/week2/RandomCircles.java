package week2;

import acm.program.GraphicsProgram;
import acm.graphics.*;
import acm.util.*; 

/*This program draws 10 circles with different sizes, colors and positions
 *   each circle has randomly chosen colors, positions and sizes */
public class RandomCircles extends GraphicsProgram {

	private RandomGenerator rGen = RandomGenerator.getInstance();
    private static final int numberOfCircles = 10;
    private static final int minRadius = 5;
    private static final int maxRadius = 50;
 
    public void run() {
        for(int i=0; i<numberOfCircles; i++ ) {
           
        double radius = rGen.nextDouble(minRadius, maxRadius);
        double x = rGen.nextDouble(0, getWidth() - radius*2);
        double y = rGen.nextDouble(0, getHeight() - radius*2);
        GOval circle = new GOval(x, y, radius, radius);
        circle.setFilled(true);
        circle.setColor(rGen.nextColor());
        add(circle);
        }
}
}