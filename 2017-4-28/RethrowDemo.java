class Rethrow {
	public static void genException() {
		int numerators[] = {7,42,69,99,5,12,21,10};
		int denominators[] = {7,2,0,4,0,0};

		for (int i = 0; i<numerators.length; i++) {
			try{
				System.out.println(numerators[i]/denominators[i]);
			}
			catch(ArithmeticException e) {
				System.out.println("Division by Zero!");
			}

			catch (ArrayIndexOutOfBoundsException e){
				System.out.println("Index out-of-bounds!");
				throw e;
			}
		}
	}
}


class RethrowDemo {
	public static void main(String[] args) {
		try {
			Rethrow.genException();

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Fatal error - program terminated.");
		}
	}
}