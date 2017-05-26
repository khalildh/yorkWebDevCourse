class Summation {

	public int sum;

	public Summation(int x){
		for (int i =0; i <= x; i++) {
			sum += i;
		}
	}

	public Summation(Summation d){
		sum = d.sum;
	}

}

class SumDemo {
	public static void main(String[] args) {

		Summation ob;
		
		Summation ob2;

		for (int i = 1; i < 16; i++) {
			
			ob = new Summation(i);
			System.out.println("ob1 value: " + ob.sum);

			ob2 = new Summation(ob.sum);
			System.out.println("ob2 value: " + ob2.sum);
		}
	}
}