package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	 public void run() {

		 String x ="This is a headache";
			int size = x.length();
			char key = 'a';
					
			int i = 0;
			String result = "";
			while (i != size) {
				if (x.charAt(i) != key) {
				result = result + x.charAt(i);
				}
				++i;
			}
			System.out.println(result);
			
			}

	 }

	 