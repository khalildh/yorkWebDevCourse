class WhateverYouWant {
	public static void main(String[] args) {
		System.out.println("One\nTwo\nThree");
	
		System.out.println("\n\n\n");

		System.out.println("P\tQ\tAND\tOR\tXOR\tNOTP\tNOTQ");

		// boolean p = true;
		// boolean q = true;
		// for (int  i = 0; i < 4; i++ ) {
		// 	System.out.println(p +"\t" + q + "\t" + (p && q) + "\t" + (p || q) + "\t" + (p ^ q) + "\t" + !(p) + "\t" + !(q));
		// 	q = !q;
		// 	if (i == 1) {
		// 		p = !p;
		// 	}
		// }
		recur(true, true, 0);
	}

	public static void recur(boolean p, boolean q, int i){
		System.out.println(p +"\t" + q + "\t" + (p && q) + "\t" + (p || q) + "\t" + (p ^ q) + "\t" + !(p) + "\t" + !(q));
		q = !q;
		i += 1;
		if (i == 2) {
			p = !p;
		}
		if (i < 4) {
			recur(p, q, i);
		}
	}

}