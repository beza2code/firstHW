package week2;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;
import java.awt.event.MouseEvent; 

/* This program allows users to create lines on the graphics
 canvas by clicking and dragging with the mouse. The line
 is redrawn from the original point to the new endpoint, which
 makes it look as if it is connected with a rubber band.*/

public class DrawingLines extends GraphicsProgram {
	 private GLine line; 

	public void run() {
		 addMouseListeners();
	}	 
	public void mousePressed(MouseEvent event ) {
		 double x = event.getX();
		 double y = event.getY();
		 line = new GLine(x, y, x, y);
		 add(line);
		 }
		 
		 public void mouseDragged(MouseEvent event) {
		 double x = event.getX();
		 double y = event.getY();
		 line.setEndPoint(x, y);
		 }
		
}
