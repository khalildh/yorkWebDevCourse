class Exctest {
	//generate an exception
	static void genException() {
		int nums[] = new int[4];

		System.out.println("Before exception is generated.");

		// generate an exception
		nums[6] = 8;

		System.out.println("hello");

	}
}


class ExcDemo2 {
	public static void main(String args[]) {
		int numerators[] = {7,42,69,99,5,12,21,10};
		int denominators[] = {7,2,0,4,0,0};
		

		// try {
		// 	//Exctest.genException();

		// 	for (int i = 0; i<numerators.length; i++) {
		// 		System.out.println(numerators[i]/denominators[i]);
		// 	}
		// }

		// catch(ArithmeticException e) {
		// 	System.out.println("Division by Zero!");
		// }

		// catch (ArrayIndexOutOfBoundsException e) {
		// 	System.out.println("Index out-of-bounds!");
		// }

		// System.out.println("After try-catch ladder");

		try {

			for (int i = 0; i<numerators.length; i++) {
				try{
					System.out.println(numerators[i]/denominators[i]);
				}
				catch(ArithmeticException e) {
					System.out.println("Division by Zero!");
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Index out-of-bounds!");
		}

		catch(Throwable e) {
			System.out.println("Caught an Exception with Trhowable!");
		}
		System.out.println("After outer try-catch.");
	}
}