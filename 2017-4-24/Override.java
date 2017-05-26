class Aa {
	public int i,j;

	Aa() {
		i = j = 0;
	}

	Aa(int a, int b) {
		i = a;
		j =b;
	}

	public void show(){
		System.out.println("i and j: " + i + ", " + j);
	}
}

class Bb extends Aa{
	public int k;

	Bb() {
		k = 0;
	}

	Bb(int x, int y, int z) {
		super(x, y);
		k = z;
	}

	public void show() {
		System.out.println("k: " + k);
	}

	public void superShow() {
		super.show();
	}
}

class Override {
	public static void main(String[] args) {
		Bb ob = new Bb(4, 5, 6);

		ob.superShow();
	}
}