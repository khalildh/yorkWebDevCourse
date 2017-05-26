class Overload {

	void ovlDemo() {
		System.out.println("No parameter");
	}

	void ovlDemo(int a) {
		System.out.println("One parameter: " + a);
	}

}

class OverloadDemo {
	public static void main(String[] args) {
		Overload ob = new Overload();
		
		ob.ovlDemo();
		System.out.println();

		ob.ovlDemo(1);
	}
}