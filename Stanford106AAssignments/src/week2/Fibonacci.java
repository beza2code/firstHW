package week2;

import acm.program.*;

// This program lists the terms in the Fibonacci sequence 
// display the largest Fibonacci term of 10000

public class Fibonacci extends ConsoleProgram {
	private static final int MAX_TERM_VALUE = 10000;

	
	public void run() {
		int num1 = 0;
		int num2 = 1;
		
			while (num1 <= MAX_TERM_VALUE) {
					System.out.println(num1);
			
					int num3 = num1 + num2;

					num1 = num2;
					num2 = num3;

}
	}
	
			
		
}
