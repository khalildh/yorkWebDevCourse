class MyClass {
	private int alpha;
	public int beta;
	public int gamma;

	void setAlpha(int a) {
		alpha = a;
	}

	int getAlpha() {
		return alpha;
	}
}

class AccessDemo {
	public static void main(String[] args) {
		MyClass ob = new MyClass();

		System.out.println(ob.getAlpha());

		ob.setAlpha(20);

		System.out.println(ob.getAlpha());

		ob.beta = 40;
		ob.gamma = 60;

		System.out.println(ob.beta);
		System.out.println(ob.gamma);
	}
}