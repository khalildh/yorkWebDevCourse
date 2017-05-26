class Factorial {
	// int factR(int n) {
	// 	int result;
	// 	if (n == 1) {
	// 		return 1;
	// 	}
	// 	result = factR(n - 1) * n;
	// 	return result;
	// }

	// int factR(int n, int i, int result) {


	// 	if (i <= n) {
	// 		result = factR(n, i+1, result) * i;
	// 		return result;
	// 	}

	// 	return result;

	// }

	// int factR(int n, int i) {
	// 	int result;

	// 	if (n == 1 || n == 0) {
	// 		result = 1;
	// 	} 
	// 	if (i <= n) {
	// 		result = factR(n, i+1) * i;
	// 		return result;
	// 	}

	// 	return 1;

	// }

	int factR(int n) {
		int result;

		if (n == 1 || n == 0) {
			result = 1;
		} 
		if (i <= n) {
			result = factR(n, i+1) * i;
			return result;
		}
		return 1;
	}


	int factI(int n) {
		int t, result;

		result = 1;
		for (t=1; t <= n; t++) {
			result *= t;
		}
		return result;
	}
}

class Recursion {
	public static void main(String[] args) {
		Factorial f = new Factorial();

		System.out.println("Factorials using recursive method.");
		System.out.println("Factorial of 3 is " + f.factR(1, 1));
		System.out.println("Factorial of 4 is " + f.factR(2, 1));
		System.out.println("Factorial of 5 is " + f.factR(3, 1));

		for (int i = 4; i <= 20; i++) {

			System.out.println("Factorial of " + i + " is " + f.factR(i, 1));
			
		}
		System.out.println();

		System.out.println("Factorials using iterative method.");
		System.out.println("Factorial of 3 is " + f.factI(3));
		System.out.println("Factorial of 4 is " + f.factI(4));
		System.out.println("Factorial of 5 is " + f.factI(5));
		System.out.println();
	}
}