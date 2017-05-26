import java.util.ArrayList;

class Factors {
	public static void main(String[] args) {
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int thePrime;
		//List<String> primes = new List<String>();
		for (double i = 3; i!=100000; i++) {
			//System.out.println(i);
			int prime = 0;
			for (double j = 1; j != i +1 ; j++) {
				if (i % j == 0) {
					prime++;
					if (prime > 2) {
						break;
						}
					//System.out.println((int) i + " is divisible by " + (int) j);		
				}
			if (prime > 2) {
				continue;
			}
				
				
			}
			if (prime == 2) {
				thePrime = (int) i;
				//System.out.println(i + " is prime");
				primes.add(thePrime);
			}
			
			//System.out.println("\n\n\n");
			
		}
		System.out.println(primes);
	}
} 