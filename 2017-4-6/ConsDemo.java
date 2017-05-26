class MyClass {
	int x;
	boolean y;

	MyClass(int i){
		x = i;
		y = true;
	}
}

class ConsDemo {
	public static void main(String[] args) {
		MyClass t1 = new MyClass(Integer.parseInt(args[0]));
		MyClass t2 = new MyClass(Integer.parseInt(args[1]));

		System.out.println(t1.x + " " + t2.x);
	}
}