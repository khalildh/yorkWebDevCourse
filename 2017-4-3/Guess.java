class Guess {
	public static void main(String[] args) throws 
		java.io.IOException {
			System.out.println("Guess an uppercase Letter");
			char chGuess = (char) System.in.read();

			if (chGuess == 'K') {
				System.out.println("** Right **");
			}

			else {
				if (chGuess < 'K') {
					System.out.println("... Sorry, you are too low.");
				}

				else {
					System.out.println("... Sorry, you too high.");
				}
			}

	}
}