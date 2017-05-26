class FailSoftArray {
	private int[] a;
	private int errval;
	public int length;


	// constructor to initialize member variables
	FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}

	// get an element given an index
	public int get(int index) {
		if (indexOK(index)) {
			return a[index];
		}
		return errval;
	}

	// add an element at a given index
	public boolean put(int index, int val) {
		if (indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}

	// check to see if index is within bounds
	private boolean indexOK(int index) {
		if (index >= 0  && index < length) {
			return true;
		}
		return false;
	}


}

class FSDemo {
	public static void main(String[] args) {
		FailSoftArray fs = new FailSoftArray(5, -1); 
		int x;

		for (int i = 0; i < (2*fs.length); i++) {
			fs.put(i, 10*i);
		}

		for (int i = 0; i <(2*fs.length); i++) {
			System.out.print(fs.get(i) + " ");
		}
	}
}