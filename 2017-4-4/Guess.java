class Guess {
	public static void main(String[] args) throws 
		java.io.IOException {
			// System.out.println("Guess an uppercase Letter");
			// char chGuess = (char) System.in.read();

			// if (chGuess == 'K') {
			// 	System.out.println("** Right **");
			// }

			// else {
			// 	if (chGuess < 'K') {
			// 		System.out.println("... Sorry, you are too low.");
			// 	}

			// 	else {
			// 		System.out.println("... Sorry, you too high.");
			// 	}
			// }

		
		
		// char chGuess;
		// do {
		// 	System.out.println("Guess an uppercase Letter");
		// 	chGuess = (char) returnLetter();

		// 	if (chGuess < 'K' && (int) chGuess != 13) {
		// 		System.out.println("... Sorry, you are too low.");
		// 	}

		// 	else if (chGuess > 'K' && (int) chGuess != 13) {
		// 		System.out.println("... Sorry, you are too high.");
		// 	}
		// } while(chGuess != 'K');

		// System.out.println("** Right **");

 		for (int i=0;i<10 ;i++ ) {

			for (int j=0;j<4 ;j++ ) {
		 		System.out.print((4* i + j + 1)+ "\t"); 
		 	}
			System.out.println();
		}
	}
		

	public static int returnLetter() 
	throws java.io.IOException {
		char ignore;
		int ch;
		ch = (char) System.in.read();
		do {
			ignore = (char) System.in.read();
		} while ((char) ignore != '\n');

		return ch;
	}
}