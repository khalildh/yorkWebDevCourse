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


class ExcDemo1 {
	public static void main(String args[]) {
		

		try {
			Exctest.genException();
		}

		catch(ArithmeticException e) {
			System.out.println("Division by Zero!");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out-of-bounds!");
		}

		System.out.println("After try-catch ladder");
	}
}