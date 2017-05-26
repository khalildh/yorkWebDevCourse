interface Series {

	public int getNext(int x); //return next number in series
	int getPrevious(int x);
	void reset(); //restarts
	void setStart(int x); // set starting value
	
}

class ByTwos implements Series {
	int start;
	int val;

	ByTwos() {
		start = val = 0;
	}

	ByTwos(int x) {
		start = val = x;
	}

	public int getNext(int x) {
		val += x;
		return val;
	}

	public int getPrevious(int x) {
		val -= x;
		return val;
	}

	public void reset() {
		val = start;
	}

	public void setStart(int x) {
		start = val = x;
	}

	public void loopUp(int argument1, Series ob) {

		for (int i = 0; i < argument1; i++) {

			System.out.println(ob.getNext(argument1));
		}

	}

	public void loopDown (int argument1, Series ob) {
		for (int i = 0; i < argument1; i++) {

			System.out.println(ob.getPrevious(argument1));
		}
	}
}

class SeriesDemo {

	public static void main(String[] args) {

		int argument = Integer.parseInt(args[0]);

		int argument1 = Integer.parseInt(args[1]);

		int argument2 = Integer.parseInt(args[2]);
		
		Series ob;
		ByTwos bt = new ByTwos(argument2);

		ob = bt;


		System.out.println(bt.start);

		bt.loopDown(argument1, ob);
		

		//ob.reset();

		

		bt.loopUp(argument1, ob);

		// ob.setStart(100);

		// for (int i = 0; i < 5; i++) {

		// 	System.out.println(ob.getNext(argument));
		// }


	}
}